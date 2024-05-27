package br.rest.api.services.impl;

import br.rest.api.domain.User;
import br.rest.api.repositories.UserRepository;
import br.rest.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
       Optional<User> obj = repository.findById(id);
       return obj.orElse(null);
    }
}
