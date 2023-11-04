package nl.ccs.completablefuture.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nl.ccs.completablefuture.dto.UserDTO;
import nl.ccs.completablefuture.dto.UserResponse;
import nl.ccs.completablefuture.service.InfoService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/{userId}")
    public CompletableFuture<ResponseEntity<UserDTO>> getUserinfo(@PathVariable(name = "userId") Long userId) {
        return infoService.getUserInfo(userId);
    }

}
