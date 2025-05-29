package com.java.controller;

import java.sql.SQLException;
import java.util.List;

import com.java.ejb.jsf.GroupEjbImpl;
import com.java.ejb.model.Group;
import com.java.jsf.dao.GroupDao;

public class GroupController {
	private Group ejbGroup;
	private GroupEjbImpl groupEjbImpl;
	private com.java.jsf.model.Group group;
	private GroupDao groupDao;

	
public Group getEjbGroup() {
		return ejbGroup;
	}
	public void setEjbGroup(Group ejbGroup) {
		this.ejbGroup = ejbGroup;
	}
	public GroupEjbImpl getGroupEjbImpl() {
		return groupEjbImpl;
	}
	public void setGroupEjbImpl(GroupEjbImpl groupEjbImpl) {
		this.groupEjbImpl = groupEjbImpl;
	}
	public com.java.jsf.model.Group getGroup() {
		return group;
	}
	public void setGroup(com.java.jsf.model.Group group) {
		this.group = group;
	}
	public GroupDao getGroupDao() {
		return groupDao;
	}
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	
	public String addGroup(com.java.jsf.model.Group group) {
		return groupDao.addGroup(group);
	}
	
	public List<Group> showGroup() throws SQLException{
		return groupEjbImpl.showGroupEjb();
	}

}
