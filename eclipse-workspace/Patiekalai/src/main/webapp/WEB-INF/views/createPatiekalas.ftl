
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
  <@spring.bind "patiekalas"/>
	<#if noErrors??>
<table class="table table-bordered">
	<tr>
	<th> patiekalo grupe</th>
	<th> patiekalo pavadinimas</th>
	<th> kaloriju skaicius</th>
	<th> kaina</th>
	</tr>
	<tr>
		<td> ${patiekalas.patiekaloGrupe}</td>
		<td> ${patiekalas.patiekaloPavadinimas}</td>
		<td> ${patiekalas.kalorijuSkaicius}</td>
		<td> ${patiekalas.kaina}</td>
	</tr>
</table>
	<a href = "/Patiekalai/"><button class = "btn bt-default">Rodyti Vartotojus</button></a>
	<#else>
	<form name "patiekalas" action="/Patiekalai/addPatiekalas" method="post">
		Patiekalo Grupe: <br>
		<@spring.formInput "patiekalas.patiekaloGrupe"/>
		<@spring.showErrors "<br>"/><p>
		Patiekalo Pavadinimas: <br>
		<@spring.formInput "patiekalas.patiekaloPavadinimas"/>
		<@spring.showErrors "<br>"/><p>
		Patiekalo kaloriju Skaicius: <br>
		<@spring.formInput "patiekalas.kalorijuSkaicius"/>
		<@spring.showErrors "<br>"/><p>
		Kaina: <br>
		<@spring.formInput "patiekalas.kaina"/>
		<@spring.showErrors "<br>"/><p>
		<input type = "submit" class = "btn bt-default" value = "prideti">
	</form>
	</#if>
</div>

</body>
<script src="/resources/js/jquery-3.2.1.min.js"></script>
<script src="/resources/js/main.js"></script>
</html>