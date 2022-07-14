package ec.edu.espe.arquitectura.sistema2.dao;

import ec.edu.espe.arquitectura.sistema2.model.Narcotraficantes;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NarcotraficantesRepository extends MongoRepository<Narcotraficantes, String> {

    Optional<Narcotraficantes> findByNombreCompleto(String nombreCompleto);
}
