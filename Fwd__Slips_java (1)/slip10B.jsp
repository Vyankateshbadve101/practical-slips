<%@ page language="java" import="java.io.*,java.lang.*"%>
<%!
	int rem=0;
	int rev=0;
	int no=0;
%>

<%
	no=Integer.parseInt(request.getParameter("text1"));
	
	 while(no!=0)
	 {
	 	rem=no%10;
	 	rev=(rev*10)+rem;
	 	no=no/10;
	 }
	 out.println("The Reverse Numbers are Displayed Below:"+rev);
	 	
%>