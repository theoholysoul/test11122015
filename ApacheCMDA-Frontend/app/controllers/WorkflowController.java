package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.DataSet;
import models.metadata.Tag;
import models.metadata.Workflow;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import views.html.climate.dataSetList;
import views.html.climate.home;
import views.html.climate.tags;
import views.html.climate.workflow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Holysoul on 11/12/15.
 */
public class WorkflowController extends Controller {
    final static Form<Workflow> workflowForm = Form
            .form(Workflow.class);

    public static Result home(String email, String vfile, String dataset) {
        return ok(home.render(email, vfile, dataset));
    }


    public static Result workflows() {
        return ok(workflow.render(Workflow.getAll(), workflowForm));
    }

    public static Result getCreateResult(){
        Form<DataSet> dc = workflowForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        String title = "";
        String description = "";
        String image = "";
        String contributor = "";
        String instruction = "";
        String dataset = "";


        //Date dataSetStartTime = new Date(0), dataSetEndTime = new Date();




        try {
            title = dc.field("Workflow Title").value();
            description = dc.field("Workflow Description").value();
            image = dc.field("Workflow Image").value();
            contributor = dc.field("Workflow Contributor").value();
            instruction = dc.field("Workflow Instruction").value();
            dataset = dc.field("Workflow Dataset").value();

            //endTime = dc.field("Dataset End Time").value();
            //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");

            /*
            if (!startTime.isEmpty()) {
                try {
                    dataSetStartTime = simpleDateFormat.parse(startTime);
                    Date min = new Date(0);
                    Date max = new Date();
                    if (dataSetStartTime.before(min)) {
                        dataSetStartTime = min;
                    } else if (dataSetStartTime.after(max)) {
                        dataSetStartTime = max;
                    }
                } catch (ParseException e) {
                    System.out.println("Wrong Date Format :" + startTime);
                    return badRequest("Wrong Date Format :" + startTime);
                }
            }

            if (!endTime.isEmpty()) {
                try {
                    dataSetEndTime = simpleDateFormat.parse(endTime);
                    Date min = new Date(0);
                    Date max = new Date();
                    if (dataSetEndTime.before(min)) {
                        dataSetEndTime = min;
                    }
                    else if (dataSetEndTime.after(max)) {
                        dataSetEndTime = max;
                    }
                } catch (ParseException e) {
                    System.out.println("Wrong Date Format :" + endTime);
                    return badRequest("Wrong Date Format :" + endTime);
                }
            }*/
        } catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(APICall.ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall.createResponse(APICall.ResponseType.UNKNOWN));
        }


        List<DataSet> response = Workflow.insertWorkflow(title, description, image, contributor, instruction, dataset);
        return ok(workflow.render(response, workflowForm));
    }


    } ;

    pubilc static Result createWorflow() {};
}
