package co.com.claro.cavGarantias.model;

import co.com.claro.cavGarantias.entity.GarCav;
import java.util.List;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DataResponse {

    @Getter
    @Setter
    private GenericResponse response;

    @Getter
    @Setter
    private List<GarCav> cavs;

}
