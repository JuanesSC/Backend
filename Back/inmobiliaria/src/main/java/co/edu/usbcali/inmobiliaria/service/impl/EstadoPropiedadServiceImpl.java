package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.mapper.EstadoPropiedadMapper;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.EstadoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.EstadoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstadoPropiedadServiceImpl implements EstadoPropiedadService {

    private final EstadoPropiedadRepository estadoPropiedadRepository;

    @Override
    public List<EstadoPropiedad> getAllEstadoPropiedad() {
        return estadoPropiedadRepository.findAll();
    }

    @Override
    public EstadoPropiedadDTO getEstadoPropiedadPorId(Integer id) {

        // Consultar en db el estado propiedad por ID
        EstadoPropiedad estadoPropiedad = estadoPropiedadRepository.getReferenceById(id);

        // Mapear hacia dto el resultado que trae el modelo
        EstadoPropiedadDTO estadoPropiedadDTO = EstadoPropiedadMapper.modelToDTO(estadoPropiedad);

        // retornar el objeto mapeado a DTO
        return estadoPropiedadDTO;
    }
}
