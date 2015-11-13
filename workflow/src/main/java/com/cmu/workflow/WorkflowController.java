package com.cmu.workflow;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmu.workflow.model.Workflow;
import com.cmu.workflow.service.WorkflowService;

@Controller
public class WorkflowController {
	private static final Logger logger = LoggerFactory
			.getLogger(WorkflowController.class);
	private WorkflowService workflowService;

	@Autowired(required = true)
	@Qualifier(value = "workflowService")
	public void setWorkflowService(WorkflowService workflowService) {
		this.workflowService = workflowService;
	}

	@RequestMapping(value = "/addWorkflow", method = {
			RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody Integer addWorkflow(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "description") String description,
			@RequestParam(value = "image") String image,
			@RequestParam(value = "component") String component,
			@RequestParam(value = "input") String input,
			@RequestParam(value = "output") String output,
			@RequestParam(value = "contributors") String contributors,
			@RequestParam(value = "tag") String tag,
			@RequestParam(value = "link") String link,
			@RequestParam(value = "instruction") String instruction,
			@RequestParam(value = "dataset") String dataset) {
		Workflow workflow = new Workflow();
		workflow.setName(name);
		workflow.setDescription(description);
		workflow.setImage(image);
		workflow.setComponent(component);
		workflow.setInput(input);
		workflow.setOutput(output);
		workflow.setContributors(contributors);
		workflow.setTag(tag);
		workflow.setLink(link);
		workflow.setInstruction(instruction);
		workflow.setDataset(dataset);
		int id = this.workflowService.addWorkflow(workflow);
		return id;
	}
	
	@RequestMapping(value = "/workflows", method = {
			RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody List<Workflow> listWorkflow(){
		return this.workflowService.listWorkflows();
	}
}
