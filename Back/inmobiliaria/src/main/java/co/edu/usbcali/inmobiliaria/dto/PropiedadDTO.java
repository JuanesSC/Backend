package co.edu.usbcali.inmobiliaria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropiedadDTO {
    private String direccion;
    private String ciudad;
    private String codigo_postal;
    private Integer metros_cuadrados;
    private Integer habitaciones;
    private Integer banos;
    private Double precio;
    private LocalDateTime fecha_creacion;
}
