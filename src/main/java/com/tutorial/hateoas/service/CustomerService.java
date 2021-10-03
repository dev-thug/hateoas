package com.tutorial.hateoas.service;

import com.tutorial.hateoas.dto.CustomerDTO;
import com.tutorial.hateoas.entity.Customer;
import com.tutorial.hateoas.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Page<CustomerDTO> get(Pageable pageable, Integer totalElements) {
        Page<Customer> customers = repository.findAll(pageable, totalElements);
        return customers.map(CustomerDTO::of);
    }
}
