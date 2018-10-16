<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In Page</title>
</head>
<body>
	<div align="center">
		<h2 style="color: Slateblue;">Signin Page</h2>
		<form name="loginForm" action="Login" method="post">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<br>
			<button name="submit" value="Signin">Signin</button>
			<button name="reset" value="Reset">Reset</button>
			<button name="forgotPassword" value="Forgot Password">Forgot Password</button>
		</form>
	</div>
</body>
</html>