<!DOCTYPE html>
<html>
<body>
<h1>Welcome ${name} </h1>
<%int r_no = (int) request.getAttribute("r_no"); %>
<h4>This Is The Dashboard</h4>

<br>
<%if (r_no == 0){ %>
<button >Add Residency</button>
<%} else {%>
<h1>U Have A Residency</h1>
<%} %>



</body>

</html>