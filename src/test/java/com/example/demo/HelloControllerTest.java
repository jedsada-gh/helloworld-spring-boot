package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.*;

import java.net.URL;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private MainController mainController;

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeEach
    public void setUp() throws Exception {
        // TODO: setup before testing ACT
    }

    @Test
    public void getInstanceNotShouldBeNull() throws Exception {
        assertThat(mainController).isNotNull();
    }

    @Test
    public void getHelloWorldNotShouldBeNull() throws Exception {
        String mockUsername = "20scoops";
        User req = this.restTemplate.getForObject("http://localhost:" + port + "/hello-world?username=" + mockUsername,
                User.class);
        assertThat(mockUsername).isEqualTo(req.getUsername());
    }
}
