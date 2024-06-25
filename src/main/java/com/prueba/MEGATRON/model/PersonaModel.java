package com.prueba.MEGATRON.model;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
@Table(name = "PERSONA")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Nombre;
    private String Apellido;
    private String TipoDocumento;
    private String Documento;

    @OneToMany(mappedBy = "personaModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FacturaModel> facturaModel;
}
