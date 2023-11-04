package nl.ccs.completablefuture.service;

import nl.ccs.completablefuture.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class UserService {

    public CompletableFuture<UserDTO> getUserById(Long userId) {
        return CompletableFuture.completedFuture(UserDTO.builder().id(1L).name("Carlo").build());
    }

}
