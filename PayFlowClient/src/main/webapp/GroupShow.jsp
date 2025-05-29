<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
 
<f:view>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Group Show</title>
	<h:form>
	
	<h:dataTable value="#{groupController.showGroup()}" var="g">

				<h:column>
					<f:facet name="header">
						<h:outputText value="id"/>
					</f:facet>
					<h:outputText value="#{g.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="name"/>
					</f:facet>
					<h:outputText value="#{g.name}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="createdAt"/>
					</f:facet>
					<h:outputText value="#{g.created}" />
				</h:column>
			
				</h:dataTable>
				</h:form>
				</head>
				</html>
				</f:view>
				
 