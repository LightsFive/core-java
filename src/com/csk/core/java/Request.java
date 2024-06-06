package com.csk.core.java;

import java.util.ArrayList;
import java.util.List;

public class Request {

    List<Client> clients;
    List<State> states;
    List<Lob> lobs;

    public List<Entity> mapToEntity() {

        List<Entity> entities = new ArrayList<>();

        int i = 0;

        while (i < clients.size() && i < states.size() && i < lobs.size()) {

            Client client = clients.get(i);
            State state = states.get(i);
            Lob lob = lobs.get(i);

            Entity entity = new Entity(client.clientName, state.stateName, lob.lobName);

            entities.add(entity);
            i++;
        }
        return entities;
    }

    static class Client {

        private String clientId;
        private String clientName;
    }

    static class State {

        private String stateCode;
        private String stateName;
    }

    static class Lob {

        private String lobId;
        private String lobName;
    }
}
