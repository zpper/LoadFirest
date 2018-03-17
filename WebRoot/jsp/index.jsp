<HTML>
    <HEAD>
        <TITLE>My App Home</TITLE>
        
    <%
        String javaVersion = System.getProperty("java.version");
    %>
    </HEAD>
    <BODY>
        <p>Current JRE version: <font color="#FF0000"><%=javaVersion%></font></p>
        <p>
        <a href="/servlet/myfirstservlet?userName=userA">
            	为什么会有这一个servlet
    </BODY>
</HTML>