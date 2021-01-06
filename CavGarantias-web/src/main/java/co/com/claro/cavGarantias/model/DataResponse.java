package co.com.claro.imeiBloqueo.model;

import co.com.claro.imeiBloqueo.entity.CodigoscvcOtp;
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
    private List<CodigoscvcOtp> codesCVC;

}
