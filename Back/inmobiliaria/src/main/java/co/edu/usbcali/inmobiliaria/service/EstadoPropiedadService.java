package co.edu.usbcali.inmobiliaria.service;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateEstadoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateEstadoPropiedadResponse;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;

import java.util.List;

public interface EstadoPropiedadService {
    List<EstadoPropiedad> getAllEstadosPropiedad();

    EstadoPropiedadDTO getEstadoPropiedadPorId(Integer id);

    // Mwtodo para guardar un nuevo estado de propiedad
    CreateEstadoPropiedadResponse createEstadoPropiedad(CreateEstadoPropiedadRequest request) throws Exception;
}