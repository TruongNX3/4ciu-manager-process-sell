package com.codegym.managerprocesssale.controller;

import com.codegym.managerprocesssale.model.Item;
import com.codegym.managerprocesssale.model.OrderDetails;
import com.codegym.managerprocesssale.model.Product;
import com.codegym.managerprocesssale.service.OrderDetailsService;
import com.codegym.managerprocesssale.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class AddToCardController {
    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("addtocard/{id}")
    public ModelAndView addToCard(@PathVariable("id") Integer id, HttpServletRequest request) {
        long quantity = 1;
        Optional<Product> product = productService.findById(id);
        HttpSession session = request.getSession();
        if (session.getAttribute("order") == null) {
            com.codegym.managerprocesssale.model.Order order = new com.codegym.managerprocesssale.model.Order();
            List<Item> items = new ArrayList<Item>();
            Item item = new Item();
            item.setProduct(product.get());
            item.setQuantity(quantity);
            item.setPrice(product.get().getUnitPrice());
            items.add(item);
            order.setItems(items);
            session.setAttribute("order", order);
        } else {
            com.codegym.managerprocesssale.model.Order order = (com.codegym.managerprocesssale.model.Order) session.getAttribute("order");
            List<Item> items = order.getItems();
            boolean check = false;
            for (Item item: items) {
                if (item.getProduct().getId() == product.get().getId()) {
                    item.setQuantity(item.getQuantity() + 1);
                    check = true;
                }
            }
            if (check == false) {
                Item item = new Item();
                item.setQuantity(quantity);
                item.setPrice(product.get().getUnitPrice());
                item.setProduct(product.get());
                items.add(item);
            }
            session.setAttribute("order",order);
        }
        ModelAndView modelAndView = new ModelAndView("redirect:/admin/products");
        modelAndView.addObject("session", session);
        return modelAndView;
    }

    @GetMapping("/card")
    public ModelAndView card() {
        ModelAndView modelAndView = new ModelAndView("card/card");
        return modelAndView;
    }

    @PostMapping("/order-details")
    public ModelAndView orderDetails(@ModelAttribute("orderDetails") OrderDetails orderDetails) {
        orderDetailsService.save(orderDetails);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }
}
