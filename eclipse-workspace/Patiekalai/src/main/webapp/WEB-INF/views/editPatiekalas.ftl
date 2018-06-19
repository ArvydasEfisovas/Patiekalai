<#setting number_format="computer">
<!DOCTYPE html>
<#import "templates/spring.ftl" as spring/>
<html lang="en">
<html manifest="cache.manifest">
<head>
  <link rel="shortcut icon" type="image/x-icon" href="img/mouseicon.ico" />
  <title>Patiekalo Registracija</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <#include "/resources/css/style.css">
  <style>
  </style>

</head>
<body>
  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class = "navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
      <div class="collapse navbar-collapse" id ="myNavbar">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="/KnyguLaboras/"> Home</a></li>
          <li ><a href="#" class ="scrollto1" type="button"> About</a></li>
          <li ><a href="#" class ="scrollto2"> Info</a></li>
          <li ><a href="#" class ="scrollto3"> Contact</a></li>
        </ul>
      </div>
    </div>
  </nav>






<div class="container">
  	<form name = "patiekalas" action="/Patiekalai/updatePatiekalas" method ="post">
  	<label  for="ID">ID:</label><p>
	<input placeholder = "ID"  type ="number" name = "id" value = "${patiekalas.id}" readonly = "true"><p>
	<label  for="Patiekalo Grupe">Patiekalo Grupe:</label><p>
	<@spring.formInput "patiekalas.patiekaloGrupe"/><p>
	<label  for="Patiekalo Pavadinimas">Patiekalo Pavadinimas:</label><p>
	<@spring.formInput "patiekalas.patiekaloPavadinimas"/><p>
	<label  for="Patiekalo Kaloriju Skaicius">Patiekalo Kaloriju Kiekis:</label><p>
	<@spring.formInput "patiekalas.kalorijuSkaicius"/><p>
	<label  for="kaina">Kaina:</label><p>
	<@spring.formInput "patiekalas.kaina"/><p>
	<p>
	<input type = "submit" class = "btn bt-default" value = "Redaguoti">
	</form>
</div>

</body>
<script src="/resources/js/jquery-3.2.1.min.js"></script>
<script src="/resources/js/main.js"></script>
</html>