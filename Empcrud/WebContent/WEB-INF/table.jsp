<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List, com.crud.Employee" %> 
<%List<Employee> emp=(List<Employee>) request.getAttribute("elist"); %>
<%Employee Emp=(Employee)request.getAttribute("Emp"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
  <center>
  <form action="http://localhost:8080/Empcrud/crud">
  <div class="text-center">
    <label for="empID">Employee ID:</label>
    <input type="text" id="empID" name="empno" value="<%=Emp.getEmpno() %>"><br><br>
    
    <label for="empName">Employee Name:</label>
    <input type="text" id="empName" name="ename" value="<%=Emp.getEname() %>"><br><br>
    
    <label for="job">Job:</label>
    <input type="text" id="job" name="job" value="<%=Emp.getJob() %>"><br><br>
    
    <label for="salary">Salary:</label>
    <input type="text" id="salary" name="salary" value="<%=Emp.getSal() %>"><br><br>
    

    
    <button name="click" value="first" onclick="first()">FIRST</button>
    <button name="click" value="next" onclick="next()">NEXT</button>
    <button name="click" value="prev" onclick="prev()">PREV</button>
    <button name="click" value="last" onclick="last()">LAST</button>
    <button name="click" value="add" onclick="add()">ADD</button>
    
    
</div></form>
  
 
    <h1>Employee List</h1>
  
    <table id="employeeTable"  class="table table-striped" border="1" style="width:50%;">
        <thead>
            <tr>
                <th  scope="col">Employee No</th>
               
                <th scope="col">Name</th>
                <th scope="col">Job</th>
                <th scope="col">Salary</th>
           
            </tr>
        </thead>
        <tr>
        <%for(Employee e:emp){ %>
        <td><%=e.getEmpno() %></td>
        <td><%=e.getEname() %></td>
        <td><%=e.getJob() %></td>
        <td><%=e.getSal() %></td>
        </tr>
        <%} %>
        <tbody>

 </tbody>
 </table>
</body>
</html>