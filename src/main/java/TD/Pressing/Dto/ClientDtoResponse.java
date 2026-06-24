package TD.Pressing.Dto;

import java.time.LocalDate;

public record ClientDtoResponse(
    Long id,
    String nom,
    String prenom,
    String contact,
    String adresse,
    LocalDate dateCreation
){}
