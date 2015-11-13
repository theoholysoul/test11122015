package com.cmu.workflow.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cmu.workflow.model.Tag;

@Repository
public class TagDAOImpl implements TagDAO {
	private static final Logger logger = LoggerFactory
			.getLogger(TagDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public int addTag(Tag tag) {
		Session session = this.sessionFactory.getCurrentSession();
		int id=(Integer)session.save(tag);
		logger.info("Tag saved successfully, Tag Details="+tag);
		return id;
	}

	@Override
	public void updateTag(Tag tag) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(tag);
		logger.info("Tag updated successfully, Tag Details="+tag);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tag> listTags() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Tag> tagList = session.createQuery("from Tag").list();
		for(Tag tag : tagList){
			logger.info("Tag List::"+tag);
		}
		return tagList;
	}

	@Override
	public Tag getTagById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Tag tag = (Tag) session.load(Tag.class, new Integer(id));
		logger.info("Tag loaded successfully, Tag details="+tag);
		return tag;
	}
	

	@Override
	public Tag getTagByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();		
		Tag tag=(Tag)session.createCriteria(Tag.class).add(Restrictions.eq("name", name)).uniqueResult();
		return tag;
	}

	@Override
	public void removeTag(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Tag tag = (Tag) session.load(Tag.class, new Integer(id));
		if(null != tag){
			session.delete(tag);
		}
		logger.info("Tag deleted successfully, tag details="+tag);
	}


}
