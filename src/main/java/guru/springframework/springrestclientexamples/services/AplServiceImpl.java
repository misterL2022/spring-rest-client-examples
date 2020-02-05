package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AplServiceImpl implements AplService {

    private RestTemplate restTemplate;

    public AplServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UserData userData = restTemplate.getForObject("http://private-anon-95226cc162-apifaketory.apiary-mock.com/api/user", UserData.class);

        return userData.getData();
    }
}
