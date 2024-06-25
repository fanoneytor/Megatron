package com.prueba.MEGATRON.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLE-FACTURA")
public class DetalleFacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private FacturaModel facturaModel;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductModel productoModel;
}
