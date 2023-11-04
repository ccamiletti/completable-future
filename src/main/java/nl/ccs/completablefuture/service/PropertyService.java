package nl.ccs.completablefuture.service;

import nl.ccs.completablefuture.dto.PropertyDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class PropertyService {

    public CompletableFuture<List<PropertyDTO>> getPropertiesByUserId(Long userId) {
        return CompletableFuture.completedFuture(
                List.of(PropertyDTO.builder().id(1L).street("de la reyweg").build(),
                        PropertyDTO.builder().id(2L).street("segbroeklaan").build(),
                        PropertyDTO.builder().id(3L).street("haalen").build())
        );
    }


}
