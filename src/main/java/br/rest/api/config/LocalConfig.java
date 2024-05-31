package br.rest.api.config;

import br.rest.api.domain.User;
import br.rest.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public List<User> startDB() {
        User u1 = new User(null, "Valdir", "vald@gmail.com", "123");
        User u2 = new User(null, "Luiz", "luiz@gmail.com", "123");

        return repository.saveAll(List.of(u1, u2));
    }
}
