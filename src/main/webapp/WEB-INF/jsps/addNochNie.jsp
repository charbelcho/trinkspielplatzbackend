<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet" href="../../addFrage.css" type="text/css">
<title></title>
</head>
<body>
	<div class="header">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="/">Trinkspiel Mania</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="/kontakt">Kontakt</a>
					</li>
				</ul>
			</div>
		</nav>

	</div>
	<div class="container">
		<div class="row mt-5 anleitung">
			<div class="card-body">
				<form action="/addNochNie" method="post">
					<div class="form-group">
						<label>Ich hab noch nie...</label>
						<textarea name="vorschlagNochNie"
							placeholder="eine Frage bei diesem Spiel vorgeschlagen"
							class="form-control" rows="3" required>
						</textarea>
					</div>
					<input type="submit" value="Frage hinzufügen" class="btn btn-info">
				</form>
			</div>
		</div>

		<div class="row pt-5">
			<h4 class="h4">Alle Fragen</h4>
			<form class="form-inline my-2 my-lg-0 mt-3" action="/search/nochNie" method="post">
				<input class="form-control mr-sm-2" type="search" name="suche"
					placeholder="Search">
				<button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
			</form>
			<table class="table">
				<th scope="col">#</th>
				<th scope="col">Frage</th>
				<c:forEach items="${alleNochNie}" var="nochNie">
					<tr>
						<td>${nochNie.id}</td>
						<td>${nochNie.nochNie}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>




	<footer> </footer>


	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
		integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
		crossorigin="anonymous"></script>

</body>
</html>