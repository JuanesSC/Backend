package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.PropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.Propiedad;
import co.edu.usbcali.inmobiliaria.mapper.PropiedadMapper;
import co.edu.usbcali.inmobiliaria.repository.PropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PropiedadServiceImpl implements PropiedadService {

    private final PropiedadRepository propiedadRepository;

    @Override
    public List<Propiedad> getAllPropiedad() {
        List<Propiedad> propiedades = propiedadRepository.findAll();

        return propiedades;
    }

    @Override
    public PropiedadDTO getPropiedadPorId(Integer id){
        return PropiedadMapper.modelToDto(
                propiedadRepository.getReferenceById(id)
        );
    }

    @Override
    public PropiedadDTO savePropiedad(PropiedadDTO propiedadDTO) throws Exception {

        // Validar que propiedad no sea nulo
        if (propiedadDTO == null){
            throw new Exception("Propiedad no puede ser nulo");
        }

        // Validar que direccion no sea nulo
        if (propiedadDTO.getDireccion() == null){
            throw new Exception("Direccion no puede ser nulo");
        }

        // Validar que ciudad no sea nulo
        if (propiedadDTO.getCiudad() == null){
            throw new Exception("Ciudad no puede ser nulo");
        }

        // Validar que codigo postal no sea nulo
        if (propiedadDTO.getCodigo_postal() == null){
            throw new Exception("Codigo postal no puede ser nulo");
        }

        // Validar que metros cuadrados no sea nulo
        if (propiedadDTO.getMetros_cuadrados() == null){
            throw new Exception("Metros cuadrados no puede ser nulo");
        }

        // Validar que habitaciones no sea nulo
        if (propiedadDTO.getHabitaciones() == null){
            throw new Exception("Habitaciones no puede ser nulo");
        }

        // Validar que baños no sea nulo
        if (propiedadDTO.getBanos() == null){
            throw new Exception("Banos no puede ser nulo");
        }

        // Validar que precio no sea nulo
        if (propiedadDTO.getPrecio() == null){
            throw new Exception("Precio no puede ser nulo");
        }

        // Validar que fecha creacion no sea nulo
        if (propiedadDTO.getFecha_creacion() == null){
            throw new Exception("Fecha creacion no puede ser nulo");
        }

        // Convertir DTO a Model
        Propiedad propiedad = PropiedadMapper.dtoToModel(propiedadDTO);

        // Persistir el modelo en db
        propiedad = propiedadRepository.save(propiedad);

        // Convertir a DTO para retornar
        PropiedadDTO propiedadDTOPersistido = PropiedadMapper.modelToDto(propiedad);

        // Retornar el DTO persistido como lo solicita el metodo
        return propiedadDTOPersistido;
    }
}
