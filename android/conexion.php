<?php

	$servidor = "localhost";
	$usuario = "root";
	$pass = "";
	$BD = "examenrepeticion";
	
	$conexion = mysqli_connect($servidor,$usuario,$pass,$BD);
	
	if (!$conexion){
		echo 'No hay conexxion ';
	}else{
		echo 'Conectado Exitosamente';
	}
		

?>