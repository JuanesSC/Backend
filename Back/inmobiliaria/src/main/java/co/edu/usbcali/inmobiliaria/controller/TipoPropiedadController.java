package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateTipoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateTipoPropiedadResponse;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-propiedad")
@RequiredArgsConstructor // Genera constructor con los atributos final
public class TipoPropiedadController {

    //Inyeccion de dependencias del Servicio en el controlador
    private final TipoPropiedadService tipoPropiedadService;

    @GetMapping("/todos")
    public List<TipoPropiedad> getAllTiposPropiedad() {

        return tipoPropiedadService.getAllTiposPropiedad();
    }
    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<TipoPropiedadDTO> buscarPorId(@PathVariable Integer id){
        TipoPropiedadDTO tipoPropiedadDTO =
                tipoPropiedadService.getTipoPropiedadPorID(id);

        return new ResponseEntity<>(tipoPropiedadDTO, HttpStatus.OK);
    }

    //metodo para guardar un nuevo tipo de propiedad y sera de tipo POST
    @PostMapping("/guardar-nuevo")
    public ResponseEntity<CreateTipoPropiedadResponse> guardarNuevo(@RequestBody CreateTipoPropiedadRequest createTipoPropiedadRequest) throws Exception {
        CreateTipoPropiedadResponse createTipoPropiedadResponse = tipoPropiedadService.createTipoPropiedad(createTipoPropiedadRequest);
        return new ResponseEntity<>(createTipoPropiedadResponse, HttpStatus.CREATED);
    }

}