<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    


<%@page import="java.util.Random" %>
<%@page import="Monsters.Monster" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="monsterStyle.css"%></style>

<title>Monster Generator Web App</title>
</head>
<body>

<h1>Monster Generator / Gerador de Monstros WEB APP</h1>



<% 

	Monster M1_Eng=new Monster();
	M1_Eng.generateStats();	

	Monster M2_PT=new Monster();
	M2_PT.generateStats();

%>


<div class="container1">
  
<h2><%= M1_Eng.generateRandomMonsterName()  %></h2>
<p>Life: <%=M1_Eng.getLife() %></p>
<p>Mana: <%=M1_Eng.getMana() %></p>
<p>Attack: <%=M1_Eng.getAttack() %></p>
<p>Gold: <%=M1_Eng.getGold() %></p>

</div>

<br>

<div class="container2">
<h2><%= M2_PT.geraNomeMonstro()  %></h2>
<p>Life: <%=M2_PT.getLife() %></p>
<p>Mana: <%=M2_PT.getMana() %></p>
<p>Attack: <%=M2_PT.getAttack() %></p>
<p>Gold: <%=M2_PT.getGold() %></p>
</div>

<button type="button" class="myButton" onClick="refreshPage()">Generate Monsters / Gerar Monstros</button>

<script>
function refreshPage(){
    window.location.reload();
} 
</script>

</body>
</html>