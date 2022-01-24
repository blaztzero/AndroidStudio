<?php

	include 'conexion.php';
	
	$codigo=$_POST['codigoChocolates'];
	$nombre=$_POST['nombreChocolates'];
	$precio=$_POST['precioChocolates'];
	
	$consulta="insert into chocolates(nombreChocolate,PrecioChocolate)values(' ".$nombre."' , '".$precio." ')";
	//insert into chocolates('nombreChocolate',' PrecioChocolate')values('".$nombre."','".$precio."')
	mysqli_query($conexion,$consulta) or die(mysqli_error($conexion));
	mysqli_close($conexion);
	
	

?>