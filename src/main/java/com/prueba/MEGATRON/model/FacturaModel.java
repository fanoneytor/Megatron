package com.prueba.MEGATRON.model;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "FACTURA")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroConsecutivo;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private PersonaModel personaModel;

    @OneToMany(mappedBy = "facturaModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetalleFacturaModel> detalleFacturaModelList;

}
