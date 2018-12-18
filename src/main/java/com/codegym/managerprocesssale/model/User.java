package com.codegym.managerprocesssale.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "Không để trống")
    private String user_name;

    @NotBlank(message = "Không để trống")
    private String password;

    @NotBlank(message = "Không để trống")
    private String name;

    @NotBlank(message = "email không để trống")
    @Email(message = "ví dụ: example@gmail.com")
    private String email;

    private String address;

    @NotNull(message = "Ngày sinh không để trống")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date birth_day;

    @Pattern(regexp = "[0-9]{10}", message = "Số điện thoại bao gồm 10 số")
    private String phone;

    private int role;

    public User() {
    }

    public User(@NotBlank(message = "Không để trống") String user_name, @NotBlank(message = "Không để trống") String password, @NotBlank(message = "Không để trống") String name, @NotBlank(message = "email is not blank") @Email(message = "ví dụ: example@gmail.com") String email, String address, @NotNull(message = "Ngày sinh không để trống") Date birth_day, @Pattern(regexp = "[0-9]{10}", message = "Số điện thoại bao gồm 10 số") String phone, int role) {
        this.user_name = user_name;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.birth_day = birth_day;
        this.phone = phone;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}