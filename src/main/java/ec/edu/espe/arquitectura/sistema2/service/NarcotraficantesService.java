package ec.edu.espe.arquitectura.sistema2.service;

import ec.edu.espe.arquitectura.sistema2.dao.NarcotraficantesRepository;
import ec.edu.espe.arquitectura.sistema2.model.Narcotraficantes;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NarcotraficantesService {

    private final NarcotraficantesRepository narcotraficantesRepository;

    public NarcotraficantesService(NarcotraficantesRepository narcotraficantesRepository) {
        this.narcotraficantesRepository = narcotraficantesRepository;
    }

    public Narcotraficantes obtenerNarcotraficantePorNombreCompleto(String nombreCompleto) {
        Optional<Narcotraficantes> narcoOpt = this.narcotraficantesRepository.findByNombreCompleto(nombreCompleto);
        return narcoOpt.orElse(null);
    }

}
