<br />

<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Sistema de Clientes</a>
		</div>
		<ul class="nav navbar-nav">
		    <li class="${param.opcion.equals('inicio')?'active':''}"><a href="index">Inicio</a></li>
			<li class="${param.opcion.equals('listar')?'active':''}"><a href="listarUsuarios">Listar Clientes</a></li>
			<li class="${param.opcion.equals('crear')?'active':''}"><a href="ingresarUsuario">Crear Usuario</a></li>
		</ul>
	</div>
</nav>