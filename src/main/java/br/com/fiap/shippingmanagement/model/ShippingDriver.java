package br.com.fiap.shippingmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@Document("shipping_driver")
public class ShippingDriver {

    @Id
    private String id;

    @DBRef
    private Shipping shipping;

    @DBRef
    private Route route;

    @DBRef
    private Driver driver;

    @DBRef
    private Address sende_address;

    @DBRef
    private Address delivery_address;

    private LocalDateTime start_delivery;

    private LocalDateTime finish_delivery;

}
