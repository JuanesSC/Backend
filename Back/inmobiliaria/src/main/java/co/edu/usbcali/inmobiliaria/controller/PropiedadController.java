package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.PropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.Propiedad;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("propiedad")
@RequiredArgsConstructor
public class PropiedadController {
    // inyeccion
    private final PropiedadService propiedadService;

    @GetMapping("/todos")
    public List<Propiedad> obtenerTodasLasPropiedades(){
        return propiedadService.getAllPropiedad();
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<PropiedadDTO> buscarPorId(@PathVariable Integer id){
        return new ResponseEntity<>(propiedadService.getPropiedadPorId(id), HttpStatus.OK);
    }
}
