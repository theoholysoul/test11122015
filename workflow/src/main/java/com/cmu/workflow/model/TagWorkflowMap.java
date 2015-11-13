package com.cmu.workflow.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tag_workflow_map")
public class TagWorkflowMap {

	private int tagId;
	private int workflowId;
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public int getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}
	@Override
	public String toString() {
		return "TagWorkflowMap [tagId=" + tagId + ", workflowId=" + workflowId
				+ "]";
	}
}
