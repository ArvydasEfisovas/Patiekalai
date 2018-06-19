<!DOCTYPE html>
<html lang="en">
<html manifest="cache.manifest">
<head>
  <title>Patiekalo Registracija</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <#include "/resources/css/style.css">  
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
          <li><a href="#"> Home</a></li>
          <li ><a href="#" class ="scrollto1" type="button"> About</a></li>
          <li ><a href="#" class ="scrollto2"> Info</a></li>
          <li ><a href="#" class ="scrollto3"> Contact</a></li>
        </ul>
      </div>
    </div>
  </nav>



<div class="container">
  <table class="table table-bordered">
	<tr>
	<th>id</th>
	<th> Patiekalo Grupe</th>
	<th> Patiekalo Pavadnimas</th>
	<th> Kaloriju Skaicius</th>
	<th> Kaina</th>
	</tr>
	<#list patiekalai as patiekalas>
	<tr>
		<td><a href = "/Patiekalai/patiekalas/${patiekalas.id}">${patiekalas.id} </a></td>
		<td> ${patiekalas.patiekaloGrupe}</td>
		<td> ${patiekalas.patiekaloPavadinimas}</td>
		<td> ${patiekalas.kalorijuSkaicius}</td>
		<td> ${patiekalas.kaina}</td>
		
		<td> <a href ="/Patiekalai/delete/${patiekalas.id}"> Trinti</a></td>
		<td> <a href ="/Patiekalai/update/${patiekalas.id}"> Redaguoti</a></td>
	</tr>
	</#list>
</table>
<p>
<a href="/Patiekalai/addPatiekalas"><button class = "btn bt-default">Sukurti</button></a> 

</div>
</body>

</html>