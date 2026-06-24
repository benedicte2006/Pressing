package TD.Pressing.Dto;

import java.time.LocalDate;

public record PaiementDtoRequest(
        Double montant,
        LocalDate Date
){}

