package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoPropiedadRepository extends JpaRepository<EstadoPropiedad, Integer> {
}
