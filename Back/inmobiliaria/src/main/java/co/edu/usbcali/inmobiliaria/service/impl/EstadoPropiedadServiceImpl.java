package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateEstadoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateEstadoPropiedadResponse;
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
    public List<EstadoPropiedad> getAllEstadosPropiedad() {
        return estadoPropiedadRepository.findAll();
    }

    @Override
    public EstadoPropiedadDTO getEstadoPropiedadPorId(Integer id) {
        EstadoPropiedad estadoPropiedad = estadoPropiedadRepository.getReferenceById(id);
        return EstadoPropiedadMapper.modelToDTO(estadoPropiedad);
    }

    // Metodo nuevo que faltaba
    @Override
    public CreateEstadoPropiedadResponse createEstadoPropiedad(CreateEstadoPropiedadRequest request) throws Exception {
        if (request == null) {
            throw new Exception("El estado de la propiedad no puede ser nulo");
        }

        if (request.getNombre() == null || request.getNombre().isBlank()) {
            throw new Exception("El nombre del estado no puede estar vacío");
        }

        if (request.getDescripcion() == null || request.getDescripcion().isBlank()) {
            throw new Exception("La descripción del estado no puede estar vacía");
        }

        EstadoPropiedad estadoPropiedad = EstadoPropiedadMapper.createRequestToModel(request);
        estadoPropiedad = estadoPropiedadRepository.save(estadoPropiedad);

        return EstadoPropiedadMapper.modelToCreateResponse(estadoPropiedad);
    }

    // Este mwodo no lo pide el service (lo podrías borrar si no lo necesitas)
    public EstadoPropiedadDTO saveEstadoPropiedad(EstadoPropiedadDTO estadoPropiedadDTO) throws Exception {
        if (estadoPropiedadDTO == null) {
            throw new Exception("El estado de la propiedad no puede ser nulo");
        }

        if (estadoPropiedadDTO.getNombre() == null || estadoPropiedadDTO.getNombre().isBlank()) {
            throw new Exception("El nombre del estado no puede estar vacío");
        }

        if (estadoPropiedadDTO.getDescripcion() == null || estadoPropiedadDTO.getDescripcion().isBlank()) {
            throw new Exception("La descripción del estado no puede estar vacía");
        }

        EstadoPropiedad estadoPropiedad = EstadoPropiedadMapper.dtoToModel(estadoPropiedadDTO);
        estadoPropiedad = estadoPropiedadRepository.save(estadoPropiedad);

        return EstadoPropiedadMapper.modelToDTO(estadoPropiedad);
    }
}