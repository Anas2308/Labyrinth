package com.Labyrinth.Labyrinth;

import jakarta.annotation.PostConstruct;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.GameDto;
import org.openapitools.client.model.GameInputDto;
import org.springframework.stereotype.Component;

@Component
public class StartupBean {

    @PostConstruct
    public void init() {

        DefaultApi api = new DefaultApi();
        api.getApiClient().setBasePath("https://mazegame.rinderle.info");


        GameInputDto input = new GameInputDto();
        input.setGroupName("MeineGruppe");


        GameDto game = api.gamePost(input);


        System.out.println("Neues Spiel angelegt mit ID: " + game.getGameId());
    }
}
