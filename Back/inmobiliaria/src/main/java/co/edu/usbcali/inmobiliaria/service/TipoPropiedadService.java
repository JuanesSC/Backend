package co.edu.usbcali.inmobiliaria.service;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateTipoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateTipoPropiedadResponse;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import java.util.List;

public interface TipoPropiedadService {
    List<TipoPropiedad> getAllTiposPropiedad();

    TipoPropiedadDTO getTipoPropiedadPorID(Integer id);

    //saveTipoPropiedad
    CreateTipoPropiedadResponse createTipoPropiedad(CreateTipoPropiedadRequest createTipoPropiedadRequest) throws Exception;

}