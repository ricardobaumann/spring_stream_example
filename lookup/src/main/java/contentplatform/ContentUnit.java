package contentplatform;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContentUnit {

    @Id
    private String id;
    private String body;

    public ContentUnit() {
    }

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

    public void setId(final String id) {
        this.id = id;
    }

    public void setBody(final String body) {
        this.body = body;
    }
}
