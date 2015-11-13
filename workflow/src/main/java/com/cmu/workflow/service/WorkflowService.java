package com.cmu.workflow.service;

import java.util.List;

import com.cmu.workflow.model.Workflow;

public interface WorkflowService {
	public int addWorkflow(Workflow workflow);
	public List<Workflow> listWorkflows();
}
