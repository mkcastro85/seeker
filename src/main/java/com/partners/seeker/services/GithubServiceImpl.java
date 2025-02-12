package com.partners.seeker.services;

import com.partners.seeker.model.Response;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubServiceImpl implements GithubService{

    @Autowired
    private RestTemplate restTemplate;
    private static final String GITHUB_API_URL = "https://api.github.com/search/users?q=";

    @Override
    public Response search(String user) {
        ResponseEntity<Response> response = restTemplate.getForEntity(GITHUB_API_URL + user, Response.class);
        return response.getBody();
    }
}
