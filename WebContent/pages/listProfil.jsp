<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript" >
				
		function searchBy(){
			this.document.fs.action="./sarch.action";
			this.document.fs.submit();
		}
		
		function redirect(){
			this.document.f.action="./redirect.action";
			this.document.f.submit();
		}		
</script>

<div class="container">

<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">E</span>diter <span style="font-size:40px;color:#0abde3">P</span>rofil</h3><br><hr width="50%"> 
<br>

	<!-- Redirect form -->
	<form name="f">
		<div class="form-group">
			<input type="submit" class="btn btn-success btn-md" onclick="redirect()" value="Retour a la page index"/>
		</div>
	</form>
	
	<!-- Search form -->
	<h3><u>Search Profils :</u></h3> 
	<br>
	<form name="fs" method="post">
		<div class="form-group">
			<label for="libelle">Libelle :</label>
			<input type="text" name="libelle" class="form-control" placeholder="Entrez un libelle"/><br>
			<!-- <input type="submit" class="btn btn-info btn-md" onclick="searchBy" value="search" /> -->
			<s:submit cssClass="btn btn-info btn-md form-control" value="Search" action="search" />
		</div>
	</form>
		
	<br>
	<!-- Listing records -->  
	<h3>Listement des profils enregistré :</h3> 
	<hr> 
	<table class="table">
  		<thead class="thead-dark">
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Libelle</th>
		      <th scope="col">Description</th>
		      <th scope="col">Operation</th>
    		</tr>
  		</thead>
  		<tbody>
		  <s:iterator value="profils">
			    <tr>
			      <th scope="row"><s:property value="id"/></th>
			      <td><s:property value="libelle"/></td>
			      <td><s:property value="description"/></td>

			      	<s:url namespace="/" action="delete" id="lien1">
			      		<s:param name="numProfil">
			      			<s:property value="id"/>
			      		</s:param>
			      	</s:url>
			      	
			      	<s:url namespace="/" action="edit" id="lien2">
			      		<s:param name="numProfil">
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
<jsp:include page="includes/_footer.jsp"/>