<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wallet</title>
</head>
<body>
<h2>enter user details</h2>
<form action="saveUser" method="post">
     <table>
         <pre>
         First Name<input type="text" name="firstName"/>
         Last Name<input type="text" name="lastName"/>
         Email<input type="text" name="email"/>
         Mobile<input type="text" name="mobile"/>
         Current Balance<input type="text" name="currentBalance"/>
         <input type="submit" value="submit"/>
         </pre>
     </table>
</form>
${msg}
</body>
</html>