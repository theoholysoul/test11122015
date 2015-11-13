/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.DataSet;
import models.metadata.ClimateService;
import models.metadata.Tag;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import util.APICall.ResponseType;
import views.html.climate.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class TagController extends Controller {

    final static Form<Tag> tagForm = Form.form(Tag.class);

    public static Result home(String email, String vfile, String dataset) {
        return ok(home.render(email, vfile, dataset));
    }


    public static Result tags() {
        return ok(tags.render(Tag.all(), tagForm));
    }

/*
    public static Result CreateTags() {
        return ok(tags.render(CreateTags.all(), tagForm));
    }



    public static Result getSearchResult(){
        Form<Tag> dc = tagForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        String tagName = "";

        String agency = "";
        String instrument = "";
        String physicalVariable = "";
        String gridDimension = "";
        String startTime = "";
        String endTime = "";
        Date dataSetStartTime = new Date(0), dataSetEndTime = new Date();

        //try {
            tagName = dc.field("Dataset Name").value();
/*
            agency = dc.field("Agency").value();
            instrument = dc.field("Instrument").value();
            physicalVariable = dc.field("Physical Variable").value();
            gridDimension = dc.field("Grid Dimension").value();
            startTime = dc.field("Dataset Start Time").value();
            endTime = dc.field("Dataset End Time").value();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");


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
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
        }
        */
        //List<tags> response = tags.insertDataSet(tagName);
        //return ok(dataSetList.render(response, tagForm));





/*


	public static Result editClimateService() {

		ObjectNode jsonData = Json.newObject();
		try {
			DynamicForm df = DynamicForm.form().bindFromRequest();
			String climateServiceName = df.field("pk").value();

			if (climateServiceName != null && !climateServiceName.isEmpty()) {
				jsonData.put("name", climateServiceName);
			}
			ClimateService originalService = ClimateService.findServiceByName(climateServiceName);
			
			if (originalService == null) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found original climateService " + climateServiceName);
			}

			jsonData.put("creatorId", 1);
			jsonData.put("purpose", originalService.getPurpose());
			jsonData.put("url", originalService.getUrl());
			jsonData.put("scenario", originalService.getScenario());
			jsonData.put("versionNo", originalService.getVersion());
			
			if (originalService.getRootservice() != null)
				
				jsonData.put("rootServiceId", originalService.getRootservice());
			String editField = df.field("name").value();
			
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}
			
			if (editField == null || editField.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found edit field");
			}

			JsonNode response = ClimateService.edit(climateServiceName, jsonData);
			Application.flashMsg(response);

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return ok("updated");

	}


	public static Result deleteClimateService() throws UnsupportedEncodingException {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String climateServiceId = df.field("idHolder").value();
		Logger.debug(climateServiceId);
		JsonNode response = ClimateService.delete(climateServiceId);
		Application.flashMsg(response);
		return redirect("/tag/climateServices");
	}


	public static Result downloadClimateService() {
		List<ClimateService> user = ClimateService.all();
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("user.json");
		try {
			mapper.writeValue(file, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response().setContentType("application/x-download");
		response().setHeader("Content-disposition",
				"attachment; filename=user.json");
		return ok(file);
	}
*/
       // }

/*
    public static Result oneService(String url) {
        return ok(oneService.render("/assets/html/" + url));
    }

*/
}
