package models.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.collections.functors.FalsePredicate;
import util.APICall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Holysoul on 11/12/15.
 */
public class Workflow {
    private int id;
    private String title;
    private String description;
    private String image;
    private String contributor;
    private String instruction;
    private String dataset;
    private List <Tag> tags;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    private static final String GET_TAGS_CALL_BY_ID = "http://www.codeee.com:8080/workflow/Tags";

    private static final String GET_WORKFLOW_CALL = "http://www.codeee.com:8080/workflow/workflow";


    public static List<Tag> getTagsByWorkflowId(int id){
        return null;
    }

    public static List<Workflow> getAll(){
        return null;
    }

    public static boolean insertWorkflow() {return false;}


  /*  public static List<Tag> all() {

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
    }*/
}
