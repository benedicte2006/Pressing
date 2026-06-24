package TD.Pressing.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public record UtilisateurDtoResponse(
    Long id,
    String nomUtilisateur,
    String password,
    LocalDate dateCreation
){}
