package nl.ccs.completablefuture.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PropertyDTO {

    private Long id;
    private String description;
    private String street;
    private String zipcode;
    private Integer number;


}
