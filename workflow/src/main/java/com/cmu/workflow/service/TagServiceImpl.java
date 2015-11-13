package com.cmu.workflow.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmu.workflow.dao.TagDAO;
import com.cmu.workflow.model.Tag;

@Service
public class TagServiceImpl implements TagService {

	private TagDAO tagDAO;

	public void setTagDAO(TagDAO tagDAO) {
		this.tagDAO = tagDAO;
	}

	@Override
	@Transactional
	public int addTag(Tag tag) {
		return this.tagDAO.addTag(tag);
	}

	@Override
	@Transactional
	public void updateTag(Tag tag) {
		this.tagDAO.updateTag(tag);
	}

	@Override
	@Transactional
	public List<Tag> listTags() {
		return this.tagDAO.listTags();
	}

	@Override
	@Transactional
	public Tag getTagById(int id) {
		return this.tagDAO.getTagById(id);
	}
	
	@Override
	@Transactional
	public Tag getTagByName(String name) {
		return this.tagDAO.getTagByName(name);
	}

	@Override
	@Transactional
	public void removeTag(int id) {
		this.tagDAO.removeTag(id);
	}


}
