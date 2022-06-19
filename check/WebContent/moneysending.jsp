<%@ page import="dbcon.Dbconn" %>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.IOException"%>
<%@ page import=" javax.servlet.ServletException"%>
<%@ page import=" javax.servlet.annotation.WebServlet"%>
<%@ page import=" javax.servlet.http.HttpServlet"%>
<%@ page import=" javax.servlet.http.HttpServletRequest"%>
<%@ page import ="javax.servlet.http.HttpServletResponse"%>

<%@ page import ="bean.Block"%>
<%@ page import ="bean.transfer"%>
<%@ page import="dbcon.Dbconn"%>
<%@ page import="imple.imple"%>
<%@ page import="inter.inter"%>

<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import ="java.sql.SQLException"%>
<%

String pemail=request.getParameter("from");
String cemail=request.getParameter("to");
String checkno=request.getParameter("checkno");

String inword=request.getParameter("aword");
String date=request.getParameter("date");
String amount=request.getParameter("amount");
String id=request.getParameter("id");
System.out.println(id);

String prehash="";
String afterhash="";

String status="Transferred";
/* String ad="Admin@gmail.com"; */
Connection con;
con=Dbconn.create();
try {
	PreparedStatement pa=con.prepareStatement("SELECT phash,ahash FROM `scam`.`transmoney`");
	ResultSet rs=pa.executeQuery();
	
/* 	PreparedStatement pa1=con.prepareStatement("UPDATE scam.checkdetails c SET status='"+status+"' where id='"+id+"'");
	ResultSet rs1=pa1.executeQuery(); */
	
	while(rs.next()){
		prehash=rs.getString(1);
		afterhash=rs.getString(2);
		
	}
	 
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try{
	
	Statement st=con.createStatement();
	st.executeUpdate("UPDATE scam.checkdetails c SET status='"+status+"' where id='"+id+"' ");

}
catch(Exception e){
	response.sendRedirect("error.jsp?inval id");
System.out.println(e);
}



System.out.println(afterhash);
prehash=afterhash;

 
 
 
Block genesisBlock = new Block("Hi im the first block", "0");

String phas=genesisBlock.hash;

Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
System.out.println("Hash for block 2 : " + secondBlock.hash);
String aphas=secondBlock.hash;
/* String address="";
String city="";
String state="";
String country=""; */

transfer ap=new transfer();
ap.setPemail(pemail);
ap.setCemail(cemail);
ap.setCheckno(checkno);
ap.setAmountinword(inword);
ap.setDate(date);
ap.setAmount(amount);
ap.setPhash(prehash);
ap.setAhash(aphas);



inter r=new imple();
int m=r.trans(ap);
if(m==1){
	
	response.sendRedirect("bankmainpage.jsp");
	
}
else{
	response.sendRedirect("error.jsp");
}

%>