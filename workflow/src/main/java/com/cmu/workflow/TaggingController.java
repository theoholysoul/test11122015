package com.cmu.workflow;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmu.workflow.model.Tag;
import com.cmu.workflow.model.TagMapping;
import com.cmu.workflow.service.TagService;

@Controller
public class TaggingController {
	private static final Logger logger = LoggerFactory.getLogger(TaggingController.class);
	private TagService tagService;
	
	@Autowired(required=true)
	@Qualifier(value="tagService")
	public void setTagService(TagService tagService){
		this.tagService=tagService;
	}
		
	@RequestMapping(value="/tagging/addTag",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Tag addTag(@RequestParam(value="name") String name){
		name=name.trim().toLowerCase();
		Tag tag;
		tag=this.tagService.getTagByName(name);
		if(tag==null){
			tag=new Tag();
			tag.setName(name);
			int id=this.tagService.addTag(tag);
			tag.setId(id);
		}
		return tag;		
	}
	@RequestMapping(value="/tags",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Tag> getTags(){
		return this.tagService.listTags();
	}
	
	@RequestMapping(value="/tagging/attachTag",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody boolean attachTag(@RequestBody TagMapping mapping){
		
		return false;
	}
}
