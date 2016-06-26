<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<title>Signin</title>

<!-- Custom styles for this template -->
<link rel="stylesheet"
	href="<c:url value="/resources/css/signin.css" />" />


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

</head>
<body>

	<c:url var="login" value="/login" />

	<div class="container">
		<form:form class="form-signin" action="${login}" method="post" commandName="user">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="email" class="sr-only">Email address</label> 
			<form:input
				type="email" path="email" id="email" class="form-control"
				placeholder="Email address" required="true" autofocus="true" /> 
			<label
				for="password" class="sr-only">Password</label> 
			<form:input
				type="password" path="password" id="password" class="form-control"
				placeholder="Password" required="true"/>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form:form>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>