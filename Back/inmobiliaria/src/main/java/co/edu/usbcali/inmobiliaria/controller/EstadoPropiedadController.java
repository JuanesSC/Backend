package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateEstadoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateEstadoPropiedadResponse;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.service.EstadoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado-propiedad")
@RequiredArgsConstructor // Genera constructor con los atributos final
public class EstadoPropiedadController {

    private final EstadoPropiedadService estadoPropiedadService;

    @GetMapping("/todos")
    public List<EstadoPropiedad> buscarTodos() {
        return estadoPropiedadService.getAllEstadosPropiedad();
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<EstadoPropiedadDTO> buscarPorId(@PathVariable Integer id) {
        EstadoPropiedadDTO estadoPropiedadDTO = estadoPropiedadService.getEstadoPropiedadPorId(id);
        return new ResponseEntity<>(estadoPropiedadDTO, HttpStatus.OK);
    }

    // MEtodo para guardar un nuevo estado de propiedad
    @PostMapping("/guardar-nuevo")
    public ResponseEntity<CreateEstadoPropiedadResponse> guardarNuevo(@RequestBody CreateEstadoPropiedadRequest request) throws Exception {
        CreateEstadoPropiedadResponse response = estadoPropiedadService.createEstadoPropiedad(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}