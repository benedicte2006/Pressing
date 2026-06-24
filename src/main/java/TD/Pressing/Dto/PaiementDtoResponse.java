package TD.Pressing.Dto;

import java.time.LocalDate;

public record PaiementDtoResponse(
        Long id,
        Double montant,
        LocalDate Date
)
{}
