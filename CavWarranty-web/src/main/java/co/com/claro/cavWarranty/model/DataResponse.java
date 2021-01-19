package co.com.claro.cavWarranty.model;

import co.com.claro.cavWarranty.entity.WarCav;
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
    private List<WarCav> cavs;

}
