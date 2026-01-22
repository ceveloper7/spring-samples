package com.restful.ws.ch02.productapi.adapter.inbound.rest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Utilizar Data Transfer Objects (DTO) Nos permite modificarlos sin afectar a la clase del dominio.
 */
public record ProductDescriptionInput(
        @NotBlank
        @Size(min = 10, max = 255)
        String description) {
}
