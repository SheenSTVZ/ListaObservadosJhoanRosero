package ec.edu.espe.arquitectura.sistema2.resource;

import ec.edu.espe.arquitectura.sistema2.model.Narcotraficantes;
import ec.edu.espe.arquitectura.sistema2.service.NarcotraficantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/narcotraficantes")
@RequiredArgsConstructor
public class NarcotraficantesResource {
    private final NarcotraficantesService narcotraficantesService;

    @GetMapping(path = "/{nombreCompleto}")
    public Narcotraficantes findByNombreCompleto(String nombreCompleto) {
        return narcotraficantesService.obtenerNarcotraficantePorNombreCompleto(nombreCompleto);
    }
}
