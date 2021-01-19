package co.com.claro.cavWarranty.model;

import co.com.claro.cavWarranty.entity.WarCav;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement (name = "DataResponse")
public class DataResponse {

    @Getter
    @Setter
    @XmlElement(required = true)
    private GenericResponse response;

    @Getter
    @Setter
    @XmlElement(required = false)
    private List<WarCav> cavs;

}
