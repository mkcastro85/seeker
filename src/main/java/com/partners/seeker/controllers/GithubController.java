package com.partners.seeker.controllers;

import com.partners.seeker.model.Response;
import com.partners.seeker.services.GithubService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class GithubController {

    private GithubService githubService;

    @GetMapping("/github/search")
    public Response searchGitHubUsers(@RequestParam String user) {
        return githubService.search(user);
    }
}