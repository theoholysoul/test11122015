package models.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import util.APICall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmhbh on 11/5/15.
 */
public class Tag {
    private int id;
    private String name;
    private static final String GET_TAGS_CALL = "http://www.codeee.com:8080/workflow/tags";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Tag> all() {

        List<Tag> tags = new ArrayList<Tag>();

        JsonNode tagNode = APICall
                .callAPI(GET_TAGS_CALL);

        if (tagNode == null || !tagNode.isArray()) {
            return tags;
        }

        for (int i = 0; i < tagNode.size(); i++) {
            JsonNode json = tagNode.path(i);
            Tag newTag = new Tag();
            newTag.setId(json.path("id").asInt());
            newTag.setName(json.get(
                    "name").asText());
           tags.add(newTag);
        }
        return tags;
    }

}
