package TD.Pressing.Dto;

import java.time.LocalDate;

public record ColisDtoRequest(
      String description ,
      Double poids ,
      Double prixUnitaire ,
      LocalDate dateDebut ,
      LocalDate dateFin
){}
