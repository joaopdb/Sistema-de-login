<?php
$host = "localhost"; //Servidor do mysql
$user = "root"; //Usuario do banco de dados
$senha = ""; //senha do banco de dados
$db = "banco"; //banco de dados
$nome_site = "nome"; //Nome do site
$email = "email@host.com"; //E-mail do administrador
$site = "http://www.meusite.com"; //Seu site n se esuqece de bota o http://

mysql_connect($host, $user, $senha) or die (mysql_error());
mysql_select_db($db) or die (mysql_error()); 
?>
