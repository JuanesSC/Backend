package co.edu.usbcali.inmobiliaria.service;
import co.edu.usbcali.inmobiliaria.dto.PersonaDTO;
import co.edu.usbcali.inmobiliaria.model.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona> getAllPersonas();

    // Metodo para consultar personas por su ID
    PersonaDTO getPersonaPorId(Integer id);
}