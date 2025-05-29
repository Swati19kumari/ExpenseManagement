package com.java.ejb.jsf;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.java.ejb.bean.GroupBeanRemote;
import com.java.ejb.bean.RemoteStatelessHelper;
import com.java.ejb.model.Group;


public class GroupEjbImpl {

	
	static GroupBeanRemote remote;
	
	static {
		
		try {
			remote=RemoteStatelessHelper.lookupRemoteStatelessGroup();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public List<Group>showGroupEjb() throws SQLException{
		return remote.showAllGroup();
	}
}
