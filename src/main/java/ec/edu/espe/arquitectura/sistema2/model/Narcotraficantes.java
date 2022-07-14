package ec.edu.espe.arquitectura.sistema2.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "narcotraficantes")
@TypeAlias("narcotraficantes")
public class Narcotraficantes {

    @Id
    private String id;

    @Indexed(name = "idx_narcotraficantes_nombreCompleto", unique = true)
    private String nombreCompleto;

    private String sancionado;
}
