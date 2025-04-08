package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("tipo-propiedad")
@RequiredArgsConstructor
public class TipoPropiedadController {
    // Inyeccion de dependencias del servicio en el controlador
    private final TipoPropiedadService tipoPropiedadService;

    @GetMapping("/todos")
    public List<TipoPropiedad> obtenerTodosLosTiposDePropiedad(){
        return tipoPropiedadService.getAllTiposPropiedad();
    }
}