package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.PersonaDTO;
import co.edu.usbcali.inmobiliaria.mapper.PersonaMapper;
import co.edu.usbcali.inmobiliaria.model.Persona;
import co.edu.usbcali.inmobiliaria.repository.PersonaRepository;
import co.edu.usbcali.inmobiliaria.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public PersonaDTO getPersonaPorId(Integer id) {

        // Consultar en db las persona por ID
        Persona persona = personaRepository.getReferenceById(id);

        // Mapear hacia DTO el resultado que trae el modelo
        PersonaDTO personaDTO = PersonaMapper.modelToDTO(persona);

        // Retornar el objeto mapeado a DTO
        return personaDTO;
    }
}
