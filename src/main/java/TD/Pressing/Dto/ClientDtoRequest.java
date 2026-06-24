package TD.Pressing.Dto;


import java.time.LocalDate;

public record ClientDtoRequest(
    String nom,
    String prenom,
    String contact,
    String adresse,
    LocalDate dateCreation
)   {}
