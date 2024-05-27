package br.rest.api.services;

import br.rest.api.domain.User;

public interface UserService {
    User findById(Integer id);

}
