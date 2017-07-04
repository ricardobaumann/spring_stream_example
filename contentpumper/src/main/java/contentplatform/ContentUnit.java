package contentplatform;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentUnit {

    private final String id;
    private final String body;

    @JsonCreator
    public ContentUnit(@JsonProperty("id") final String id,
                       @JsonProperty("body") final String body) {
        this.id = id;
        this.body = body;
    }

    public String getId() {
        return id;
    }


    public String getBody() {
        return body;
    }

}
