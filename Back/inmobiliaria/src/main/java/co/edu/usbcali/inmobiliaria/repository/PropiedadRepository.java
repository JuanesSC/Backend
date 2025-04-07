package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.Propiedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropiedadRepository extends JpaRepository<Propiedad, Integer> {
}
