package TD.Pressing.Dto;

import java.time.LocalDate;

public record ColisDtoResponse(
        Long id,
        String description,
        Double poids,
        Double prixUnitaire,
        LocalDate dateDebut,
        LocalDate dateFin
)
{}
