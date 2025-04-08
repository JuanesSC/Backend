package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.TipoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoPropiedadServiceImpl implements TipoPropiedadService {

    private final TipoPropiedadRepository tipoPropiedadRepository;

    @Override
    public List<TipoPropiedad> getAllTiposPropiedad() {
        // Implementacion de este

        // se inicializa la lista de tipos de propiedades
        // se usa el metodo findAll del repository
        // para ir a la base de datos y traer todos los tipos de propiedad
        List<TipoPropiedad> tiposPropiedad = tipoPropiedadRepository.findAll();

        return tiposPropiedad;
    }
}