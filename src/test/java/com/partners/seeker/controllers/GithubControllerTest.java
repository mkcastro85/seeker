package com.partners.seeker.controllers;

import com.partners.seeker.model.Response;
import com.partners.seeker.services.GithubService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GithubController.class)
class GithubControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GithubService githubService;

    private Response mockResponse;

    @BeforeEach
    void setUp() {
        mockResponse = new Response();
    }

    @Test
    void testSearchGitHubUsers() throws Exception {
        when(githubService.search("seeker")).thenReturn(mockResponse);

        mockMvc.perform(get("/github/search")
                        .param("user", "seeker")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
