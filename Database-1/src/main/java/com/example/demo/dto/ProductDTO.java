package com.example.demo.dto;


public record ProductDTO(
        Long id,
        String name,
        String description,
        double price,
        String category
) {}
