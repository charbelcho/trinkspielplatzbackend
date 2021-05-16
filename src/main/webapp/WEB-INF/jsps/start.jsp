<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	<link rel="stylesheet" href="../../start.css" type="text/css">
    <title></title>
</head>
<body>

<div class="header">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/">Trinkspiel Mania</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/kontakt">Kontakt</a>
      </li>
    </ul>
  </div>
</nav>

</div>
	<div class="row pt-5">
		<table class="table">
			<tr>
				<td>
					<a href="/nochNie/2" class="btn btn-warning">Ich hab noch nie – Start</a>
					
					<div class="anleitung mt-3">
						<div class="card-body">
							<p class="card-title">So geht's:</p>
							<p class="card-title">
								Ein Spieler liest die angezeigte Frage vor. 
								Alle Spieler, die die Frage mit "ja, habe ich schon mal" beantworten können, 
								müssen dann einen Schluck trinken.
							</p>
						</div>
					</div>
				<td>
			</tr>
			<tr>
				<td>
					<a href="/eher/2" class="btn btn-info">Wer würde eher – Start</a>
					
					<div class="anleitung mt-3">
						<div class="card-body">
							<p class="card-title">So geht's:</p>
							<p class="card-title">
								Ein Spieler liest die angezeigte Frage vor. 
								Dann haben alle Spieler Zeit sich zu überlegen 
								auf wen der Mitspieler die Frage am ehesten zutrifft.
								Sie zeigen auf den jeweiligen Spieler und dieser 
								trinkt die Anzahl an Schlücken von seinem Drink.
								Jeder kann auf einen beliebigen Spieler zeigen.
							</p>
						</div>
					</div>
				</td>
			</tr>
		</table>
	</div>
   
<footer>
	<nav class="footer navbar navbar-light bg-light">
	  	<div>
	  		<a class="nav-link" href="/addNochNie">Frage hinzufügen/Alle Fragen</a>
	  	</div>
	</nav>
</footer>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    
</body>
</html>