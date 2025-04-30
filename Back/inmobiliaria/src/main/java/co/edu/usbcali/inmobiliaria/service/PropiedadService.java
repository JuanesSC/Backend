package co.edu.usbcali.inmobiliaria.service;
import co.edu.usbcali.inmobiliaria.dto.PropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.Propiedad;
import java.util.List;

public interface PropiedadService {
    List<Propiedad> getAllPropiedad();
    PropiedadDTO getPropiedadPorId(Integer id);
    PropiedadDTO savePropiedad(PropiedadDTO propiedadDTO) throws Exception;
}