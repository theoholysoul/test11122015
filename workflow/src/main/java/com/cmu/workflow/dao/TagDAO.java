package com.cmu.workflow.dao;

import java.util.List;

import com.cmu.workflow.model.Tag;

public interface TagDAO {
	public int addTag(Tag tag);
	public void updateTag(Tag tag);
	public List<Tag> listTags();
	public Tag getTagById(int id);
	public Tag getTagByName(String name);
	public void removeTag(int id);
}
