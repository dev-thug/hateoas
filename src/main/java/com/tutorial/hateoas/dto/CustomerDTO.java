package com.tutorial.hateoas.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.tutorial.hateoas.entity.Customer;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PRIVATE)
@Getter
public class CustomerDTO {
    private Long id;
    private String name;

    public static CustomerDTO of(Customer customer) {
        return CustomerDTO.builder().id(customer.getId())
                .name(customer.getName()).build();
    }
}
