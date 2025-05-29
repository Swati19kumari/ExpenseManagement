<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h:form>
    
    <h:outputLabel value="Group Name"/>
    <h:inputText id="name" value="#{group.name}"/>
    
    <br>
    
	<h:commandButton action="#{groupController.addGroup(group)}" value="Add Group"/>
    
    
    
    </h:form>
    </body>
    </html>
    </f:view>