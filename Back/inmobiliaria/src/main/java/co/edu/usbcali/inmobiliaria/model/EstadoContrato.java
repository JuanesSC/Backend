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
    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @Column(name = "idEstadoContrato", length = 50)
    private String idEstadoContrato;



}
