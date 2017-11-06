package eventsource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    private final Integer id;
    private final String body;

    @JsonCreator
    public Message(@JsonProperty("id") final Integer id,
                   @JsonProperty("body") final String body) {
        this.id = id;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }


    public String getBody() {
        return body;
    }

}
