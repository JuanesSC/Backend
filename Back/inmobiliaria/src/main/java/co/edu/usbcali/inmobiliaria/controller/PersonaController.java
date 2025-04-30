package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.PersonaDTO;
import co.edu.usbcali.inmobiliaria.model.Persona;
import co.edu.usbcali.inmobiliaria.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
@RequiredArgsConstructor
public class PersonaController {
    // Inyeccion de dependencias del servicio en el controlador
    private final PersonaService personaService;

    @GetMapping("/todos")
    public List<Persona> obtenerTodasLasPersonas() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<PersonaDTO> buscarPorId(@PathVariable Integer id){
        PersonaDTO personaDTO = personaService.getPersonaPorId(id);

        return new ResponseEntity<>(personaDTO, HttpStatus.OK);
    }
}
