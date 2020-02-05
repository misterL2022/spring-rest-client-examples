package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

public interface AplService {

    List<User> getUsers(Integer limit);
}
