package com.tutorial.hateoas.controller;

import com.tutorial.hateoas.dto.CustomerDTO;
import com.tutorial.hateoas.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @GetMapping("/customers")
    public ResponseEntity<Page<CustomerDTO>> get(Pageable pageable, @RequestParam(required = false) Integer totalElements) {
        Page<CustomerDTO> customers = service.get(pageable, totalElements);
        return ResponseEntity.ok(customers);
    }
}
