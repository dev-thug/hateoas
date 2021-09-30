package com.tutorial.hateoas.assembler;

import com.tutorial.hateoas.controller.OrderController;
import com.tutorial.hateoas.entity.Order;
import com.tutorial.hateoas.entity.Status;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {
    @Override
    public EntityModel<Order> toModel(Order entity) {
        EntityModel<Order> orderModel = EntityModel.of(entity,
                linkTo(methodOn(OrderController.class).one(entity.getId())).withSelfRel(),
                linkTo(methodOn(OrderController.class).all()).withRel("orders"));

        if (entity.getStatus() == Status.IN_PROGRESS) {
            orderModel.add(linkTo(methodOn(OrderController.class).one(entity.getId())).withRel("cancel"));
            orderModel.add(linkTo(methodOn(OrderController.class).complete(entity.getId())).withRel("complete"));
        }

        return orderModel;
    }
}
