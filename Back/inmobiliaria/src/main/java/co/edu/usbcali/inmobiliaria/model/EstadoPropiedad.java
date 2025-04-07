package co.edu.usbcali.inmobiliaria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estados_propiedad")

public class EstadoPropiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_estado_propiedad", nullable = false, length =30)
    private Integer idEstadoPropiedad;

    @Column (name = "descripcion", length =30)
    private String descripcion;

    @Column (name = "nombre", length =30)
    private String nombre;

}