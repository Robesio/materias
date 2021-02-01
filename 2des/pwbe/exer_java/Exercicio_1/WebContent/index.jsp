<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Exercicio_idade</title>
</head>
<body>
<%
	String nome = request.getParameter("nome");
	String idadeString = request.getParameter("idade");
	String sexo = request.getParameter("sexo");

	if (sexo != null) {
		if (sexo.toUpperCase().equals("M")) {
			sexo = "Homen";
		} else if (sexo.toUpperCase().equals("F")) {
			sexo = "Mulher";
		} else {
			sexo = "Trans";
		}
	}

	int idade = 0;

	if (idadeString != null) {
		idade = Integer.parseInt(idadeString); //converte a String para int
		if (idade > 50) {
			idadeString = "idoso";
		} else if (idade > 25) {
			idadeString = "aduto";
		} else if (idade > 18) {
			idadeString = "jovem";
		} else if (idade > 10) {
			idadeString = "adolescente";
		} else {
			idadeString = "crian�a";
		}
	}
	out.print("0i " + nome + ", voc� tem " + idade + " anos e � " + sexo + " e � " + idadeString);
	%>
</body>
</html>