package com.prueba.MEGATRON.model;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
@Table(name = "PRODUCTO")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Descripcion;
    private Double Precio;
    private Double Costo;
    private String UM;

    @OneToMany(mappedBy = "productoModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetalleFacturaModel> detalleFacturaModel;
}
