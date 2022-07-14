package ec.edu.espe.arquitectura.sistema2.resource;

import ec.edu.espe.arquitectura.sistema2.model.Narcotraficantes;
import ec.edu.espe.arquitectura.sistema2.service.NarcotraficantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/narcotraficantes")
@RequiredArgsConstructor
public class NarcotraficantesResource {
    private final NarcotraficantesService narcotraficantesService;

    @GetMapping(path = "/{nombreCompleto}")
    public ResponseEntity<String> findByNombreCompleto(String nombreCompleto) {
        return ResponseEntity.ok(narcotraficantesService
                .obtenerNarcotraficantePorNombreCompleto(nombreCompleto)
                .getSancionado());
    }
}
