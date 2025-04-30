package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.PropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.Propiedad;

public class PropiedadMapper {

    public static PropiedadDTO modelToDto(Propiedad propiedad){
        return PropiedadDTO.builder()
                .direccion(propiedad.getDireccion())
                .ciudad(propiedad.getDireccion())
                .codigo_postal(propiedad.getCodigoPostal())
                .metros_cuadrados(propiedad.getMetrosCuadrados())
                .habitaciones(propiedad.getHabitaciones())
                .banos(propiedad.getBanos())
                .precio(propiedad.getPrecio())
                .fecha_creacion(propiedad.getFechaCreacion())
                .build();
    }

    public static Propiedad dtoToModel(PropiedadDTO propiedadDTO){
        return Propiedad.builder()
                .direccion(propiedadDTO.getDireccion())
                .ciudad(propiedadDTO.getDireccion())
                .codigoPostal(propiedadDTO.getCodigo_postal())
                .metrosCuadrados(propiedadDTO.getMetros_cuadrados())
                .habitaciones(propiedadDTO.getHabitaciones())
                .banos(propiedadDTO.getBanos())
                .precio(propiedadDTO.getPrecio())
                .fechaCreacion(propiedadDTO.getFecha_creacion())
                .build();
    }
}
