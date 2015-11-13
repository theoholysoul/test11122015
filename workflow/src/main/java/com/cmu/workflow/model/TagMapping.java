package com.cmu.workflow.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagMapping {

	private int workflowId;
	private List<Integer> tagIdList;
	
	public int getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}
	public List<Integer> getTagIdList() {
		return tagIdList;
	}
	public void setTagIdList(List<Integer> tagIdList) {
		this.tagIdList = tagIdList;
	}
	
}
