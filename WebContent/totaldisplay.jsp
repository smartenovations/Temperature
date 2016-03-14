<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<center><h1>Temperature Details</h1></center>
<table border="05" cellpadding="02" cell spacing="05" width="500" align="center">
<tr>
<th>param Id</th>
<th>Client Id</th>
<th>Date</th>
<th>unit Id</th>
<th>Temp val</th>
</tr>

<c:forEach var="list" items="${list }">
<tr>
<td>${list.paramid}</td>
<td>${list.clientid}</td>
<td>${list.dom}</td>
<td>${list.unitid}</td>
<td>${list.tempval}</td>
</tr>




</c:forEach>
</table>