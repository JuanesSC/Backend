package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateTipoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateTipoPropiedadResponse;
import co.edu.usbcali.inmobiliaria.mapper.TipoPropiedadMapper;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.TipoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoPropiedadServiceImpl implements TipoPropiedadService {

    private final TipoPropiedadRepository tipoPropiedadRepository;

    @Override
    public List<TipoPropiedad> getAllTiposPropiedad() {
        //Aqui vamos hacer la implementacion de este

        //Declaro e inicializo una lista de Tipos propiedades
        //En la inicialacion utiliza el metodo finAll del Repository
        //Para ir a la base de datos y trar todos los tipos de propiedad
        List<TipoPropiedad> tiposPropiedad = tipoPropiedadRepository.findAll();
        //Retorno los tipos de propiedad consultados en la linea anterior
        return tiposPropiedad;
    }

    @Override
    public TipoPropiedadDTO getTipoPropiedadPorID(Integer id) {

        TipoPropiedad tipoPropiedad =
                tipoPropiedadRepository.getReferenceById(id);
        TipoPropiedadDTO tipoPropiedadDTO =
                TipoPropiedadMapper.modelToDTO(tipoPropiedad);
        return tipoPropiedadDTO;
    }

    public CreateTipoPropiedadResponse createTipoPropiedad(CreateTipoPropiedadRequest createTipoPropiedadRequest) throws Exception {
        //validar que el tipo de propiedad no sea nulo
        if (createTipoPropiedadRequest == null) {
            throw new Exception("El tipo propiedad no puede ser nulo");
        }

        //validar que el nombre no sea nulo
        if (createTipoPropiedadRequest.getNombre() == null ||
                createTipoPropiedadRequest.getNombre().isBlank() == true) {

            throw new Exception("El tipo propiedad no puede ser nulo");
        }

        // validar que la descripcion del tipo de propiedad a agregar no sea nula ni vacia

        if (createTipoPropiedadRequest.getDescripcion() == null
                || createTipoPropiedadRequest.getDescripcion().isBlank() == true) {
            throw new Exception("El tipo propiedad no puede ser nula o vacia");
        }

        // Convertir de Request a Model
        TipoPropiedad tipoPropiedad = TipoPropiedadMapper.createRequestToModel(createTipoPropiedadRequest);

        // Persistir el modelo en base de datos
        tipoPropiedad = tipoPropiedadRepository.save(tipoPropiedad);

        // Convertir a Response para retornar
        CreateTipoPropiedadResponse createTipoPropiedadResponse = TipoPropiedadMapper.modelToCreateResponse(tipoPropiedad);

        // Retornar el Response persistido como lo solicita el métdodo
        return createTipoPropiedadResponse;


    }
}