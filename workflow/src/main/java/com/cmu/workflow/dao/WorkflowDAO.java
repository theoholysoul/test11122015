package com.cmu.workflow.dao;

import java.util.List;

import com.cmu.workflow.model.Workflow;

public interface WorkflowDAO {
	public int addWorkflow(Workflow workflow);
	public List<Workflow> listWorkflows();
}
