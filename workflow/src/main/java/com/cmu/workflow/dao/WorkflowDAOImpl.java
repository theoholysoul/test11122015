package com.cmu.workflow.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cmu.workflow.model.Workflow;

@Repository
public class WorkflowDAOImpl implements WorkflowDAO{

	private static final Logger logger = LoggerFactory
			.getLogger(WorkflowDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@Override
	public int addWorkflow(Workflow workflow) {
		Session session = this.sessionFactory.getCurrentSession();
		int id=(Integer)session.save(workflow);
		logger.info("Tag saved successfully, Tag Details="+workflow);
		return id;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Workflow> listWorkflows() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Workflow> workflowList = session.createQuery("from Workflow").list();
		for(Workflow workflow : workflowList){
			logger.info("Tag List::"+workflow);
		}
		return workflowList;
	}

}
