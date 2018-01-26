<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="componentes/header.jsp" %>

<style>
.page-header {
    padding-bottom: 9px;
    margin: 40px 0 20px;
    border-bottom: 1px solid #eee;
    font-size: 26px;
}
.lead {
    margin: 0 0 10px;
    font-size: 16px;
}
</style>

<script>
	$(function() {
		Request.get('/investment/api/list',{}, function(data) {
			console.log(data);
			var html = "";
			for (var index in data) {
				html += "<tr><td>"+data[index].name+"</td><td>"+data[index].value+"</td></tr>";
			}
			$("#investment").append(html);
		});
	})
</script>

     <div>
       <h1 class="page-header">Investment</h1>
       <p class="lead">Chamando API do Investment.war</p>
       <table class="table table-bordered table-condense" id="investment">
       	<tr><th>Nome</th><th>Valor</th></tr>
       </table>
     </div>

<%@ include file="componentes/footer.jsp" %>