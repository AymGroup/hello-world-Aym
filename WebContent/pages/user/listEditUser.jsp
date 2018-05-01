<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript" >
	
</script>

<div class="container">

<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">E</span>diter <span style="font-size:40px;color:#0abde3">U</span>sers</h3><br><hr width="50%"> 
<br>

	<!-- Search form -->
	<h3><u>Search Users :</u></h3> 
	<br>
	<form method="get">
		<div class="form-group">
			<label for="libelle">Login :</label>
			<input type="text" name="bean.login" class="form-control" placeholder="Entrez un login"/><br>
			<s:submit cssClass="btn btn-info btn-md form-control" action="searchUser" value="Search" />
		</div>

	</form>
	<br>

	<!-- Listing records -->  
	<h3><u>Listement des users enregistré :</u></h3> 
	<br>
	<table class="table table-striped table-hover">
  		<thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Login</th>
		      <th scope="col">Password</th>
    		</tr>
  		</thead>
  		<tbody>
		  <s:iterator value="users">
			    <tr>
			      <th scope="row"><s:property value="id"/></th>
			      <td><s:property value="login"/></td>
			      <td><s:property value="password"/></td>

			      	<s:url namespace="/user" action="delete" id="lien1">
			      		<s:param name="idUser">
			      			<s:property value="id"/>
			      		</s:param>
			      	</s:url>
			      	
			      	<s:url namespace="/user" action="getUser" id="lien2">
			      		<s:param name="idUser">
			      			<s:property value="id"/>
			      		</s:param>
			      	</s:url>

			      <td>
			      	<s:a href="%{lien1}" cssClass="btn btn-sm btn-danger">Supprimer</s:a>
			      	<s:a href="%{lien2}" cssClass="btn btn-sm btn-warning">Modifier</s:a>
			      </td>
			    </tr>
		   </s:iterator>
  		</tbody>
	</table>
	<br>
	<hr width="50%"> 
</div>
<!-- footer -->	
<jsp:include page="../includes/_footer.jsp"/>