<%@page import="modelo.Item"%>
<%@page import="modelo.Result"%>
<%@page import="manejador.Manejador"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/fontawesome.css">
    <link rel="stylesheet" href="css/mycss.css">

    <title>Web</title>
  </head>
  <body>
  <%
		Result result = new Manejador().getResult();

  %>
	<div class="container">
	<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4"><i class="fab fa-bitcoin"></i><i class="fab fa-apple"></i>News As<i class="fab fa-bitcoin"></i></h1>
    <p class="lead">Mantente informado de lo último que acontece.</p>
  </div>
</div>
	<%
	for (Item item:result.getChannel().getItems()){
	%>
		<div class="row bg-dark" style="padding:10px">
			<div class="col-md-4">
				<%
				if (item.getEnclosure()==null){%>
					<img src="img/noimage.png" alt="" width="100%" height="100%" class="img-fluid"/>
				<%}
				else {%>
					<img src="<%=item.getEnclosure().get(0).getUrl() %>" alt="" width="100%" height="100%" class="img-fluid"/>
				<%}
				%>
				
			</div>		
			<div class="col-md-8">
				<div class="card" style="height: 100%;">
				  <div class="card-header">
				    <%=item.getTitle() %>
				  </div>
				  <div class="card-body">
				    <p class="card-text"><%=item.getDescription()%></p>
				    <a href="<%=item.getLink()%>" target="_blank" class="btn btn-primary">m&aacute;s...</a>
				  </div>
				</div>		
			</div>
		</div>
	<%}%>
	
	</div> 
	    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/myjs.js"></script>
  </body>
</html>