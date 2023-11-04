package nl.ccs.completablefuture.service;

import lombok.AllArgsConstructor;
import nl.ccs.completablefuture.dto.UserDTO;
import nl.ccs.completablefuture.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class InfoService {

    private final UserService userService;
    private final PropertyService propertyService;

    public CompletableFuture<ResponseEntity<UserDTO>> getUserInfo(Long userId) {
        return userService.getUserById(userId)
                .thenCompose(userDTO -> propertyService.getPropertiesByUserId(userDTO.getId())
                        .thenApply(propertyDTOS -> {
                            userDTO.setProperties(propertyDTOS);
                            return ResponseEntity.ok(userDTO);
        }));

    }

}
