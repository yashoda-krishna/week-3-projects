package com.example.demo.mapper;


import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.ProductEntity;

public class ProductMapper {

    public static ProductDTO toDTO(ProductEntity entity) {
        return new ProductDTO(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getCategory()
        );
    }

    public static ProductEntity toEntity(ProductDTO dto) {
        ProductEntity entity = new ProductEntity();
        entity.setId(dto.id()); // Note: for create, this may be null
        entity.setName(dto.name());
        entity.setDescription(dto.description());
        entity.setPrice(dto.price());
        entity.setCategory(dto.category());
        return entity;
    }
}
