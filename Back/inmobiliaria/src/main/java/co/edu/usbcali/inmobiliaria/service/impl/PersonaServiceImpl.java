
        package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.PersonaDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreatePersonaRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePersonaResponse;
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

    public CreatePersonaResponse createPersona(CreatePersonaRequest createPersonaRequest) throws Exception {
        // Poner validaciones lógicas respecto al DTO del Tipo de Propiedad

        // Validar que el estado de propiedad no sea nulo
        if (createPersonaRequest == null) {
            throw new Exception("Persona no puede ser nulo");
        }

        // Validar que el nombre no sea nulo
        if(createPersonaRequest.getNombre() == null ||
                createPersonaRequest.getNombre().isBlank() == true){
            throw new Exception("El nombre de la persona no puede nulo o vacio");
        }

        // Validar que el apellido no sea nulo
        if(createPersonaRequest.getNombre() == null ||
                createPersonaRequest.getNombre().isBlank() == true){
            throw new Exception("El apellido no puede ser nulo o vacio");
        }

        // Validar telefono
        if(createPersonaRequest.getTelefono() == null ||
                createPersonaRequest.getTelefono().isBlank() == true){
            throw new Exception("El telefono no puede ser nulo o vacio");
        }

        // Validar email
        if(createPersonaRequest.getEmail() == null ||
                createPersonaRequest.getEmail().isBlank() == true){
            throw new Exception("El email no puede ser nulo o vacio");
        }

        // Validar direccion
        if(createPersonaRequest.getDireccion() == null ||
                createPersonaRequest.getDireccion().isBlank() == true){
            throw new Exception("La direccion no puede ser nulo o vacio");
        }

        // Validar Ciudad
        if(createPersonaRequest.getCiudad() == null ||
                createPersonaRequest.getCiudad().isBlank() == true){
            throw new Exception("La ciudad no puede ser nulo o vacio");
        }

        // Validar codigo postal
        if (createPersonaRequest.getCodigoPostal() != null && createPersonaRequest.getCodigoPostal() <= 0) {
            throw new Exception("Si se proporciona, el código postal debe ser mayor a cero");
        }

        // Convertir de Request a Model
        Persona persona = PersonaMapper.createRequestToModel(createPersonaRequest);

        // Persistir el modelo en base de datos
        persona = personaRepository.save(persona);

        // Convertir a Response para retornar
        CreatePersonaResponse createPersonaResponse = PersonaMapper.modelToCreateResponse(persona);

        // Retornar el Response persistido como lo solicita el métdodo
        return createPersonaResponse;
    }
}
