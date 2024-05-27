<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
    ${obj}
    <p id="aliens"></p>


    
</body>
<script>

    let text=""
    document.getElementById("aliens").innerHTML = text;

    print(${obj})
 
    ${obj}.array.forEach(element => {
        text += element.aid + " , " + element.aname + "<br/>"
    });

</script>
</html>