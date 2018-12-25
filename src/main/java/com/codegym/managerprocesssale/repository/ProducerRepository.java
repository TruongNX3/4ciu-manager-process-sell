package com.codegym.managerprocesssale.repository;

import com.codegym.managerprocesssale.model.Producer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProducerRepository extends PagingAndSortingRepository<Producer, Long> {
    Page<Producer> findByNameContaining(String s, Pageable pageable);
}
