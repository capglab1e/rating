<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback</title>
</head>

<body>
	<h1>
		<u>Enter Feedback</u>
	</h1>
	<f:form modelAttribute="mm" action="avgrating.obj">
		<table border="2">
			<tr>
				<td>User Id</td>
				<td><f:input path="userId" size="15" placeholder="User ID" />
					<f:errors path="userId" cssStyle="color:red" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Order Id</td>
				<td><f:input path="orderId" size="15" placeholder="Order ID" />
					<f:errors path="orderId" cssStyle="color:red" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Product Id</td>
				<td><f:input path="productId" size="15"
						placeholder="Product ID" /> <f:errors path="productId"
						cssStyle="color:red" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Comment</td>
				<td><f:input path="reviews" size="15"
						placeholder="Write your opinions" /> <f:errors path="reviews"
						cssStyle="color:red" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Rating</td>
				<td>
				<f:radiobutton path="rating" value="1" />1
				<f:radiobutton path="rating" value="2" />2
				<f:radiobutton path="rating" value="3" />3
				<f:radiobutton path="rating" value="4" />4
				<f:radiobutton path="rating" value="5" />5
				</td>
			</tr>

			<tr>
				<td colspan=2><input type="submit" value="Add Feedback" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>