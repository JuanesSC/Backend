package co.edu.usbcali.inmobiliaria.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//peticion de un cliente a otro.tipo de metodo por el cual se va comunicar, post.
//objetos de transferencias de datos, response va delvolver a las capaz superiores, un tipo de propiedad con el nombre de la descipcion
public class CreateTipoPropiedadRequest {
    private String nombre;
    private String descripcion;
}