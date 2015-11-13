package com.cmu.workflow.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmu.workflow.dao.WorkflowDAO;
import com.cmu.workflow.model.Workflow;

@Service
public class WorkflowServiceImpl implements WorkflowService{

	private WorkflowDAO workflowDAO;

	public void setWorkflowDAO(WorkflowDAO workflowDAO) {
		this.workflowDAO=workflowDAO;
	}
	@Override
	@Transactional
	public int addWorkflow(Workflow workflow) {
		return this.workflowDAO.addWorkflow(workflow);
	}

	@Override
	@Transactional
	public List<Workflow> listWorkflows() {
		return this.workflowDAO.listWorkflows();
	}

}
