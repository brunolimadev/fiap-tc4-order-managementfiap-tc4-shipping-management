package br.com.fiap.shippingmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document("route")
public class Route {

    @Id
    private String id;

    private String description;
}
