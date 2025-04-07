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
@Table(name = "estados_contrato")

public class EstadoContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_estado_contrato", nullable = false, length =30)
    private Integer idEstadoContrato;

    @Column (name = "descripcion")
    private String descripcion;

    @Column (name = "id_estado_contrato", nullable = false, length =30)
    private String nombre;
}