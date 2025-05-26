package co.edu.usbcali.inmobiliaria.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePropiedadResponse {
    private Integer idPropiedad;
    private String direccion;
    private String ciudad;
    private String codigoPostal;
    private Integer metrosCuadrados;
    private Integer habitaciones;
    private Integer banos;
    private Double precio;
    private LocalDateTime fechaCreacion;

    // Llaves foráneas (solo el ID o puedes extenderlo con info adicional)
    private Integer idPropietario;
    private Integer idAsesor;
    private Integer idTipoPropiedad;
    private Integer idEstadoPropiedad;
}
