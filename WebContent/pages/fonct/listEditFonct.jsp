<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript" >
	
</script>

<div class="container">

<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">E</span>diter <span style="font-size:40px;color:#0abde3">F</span>onctionnalite</h3><br><hr width="50%"> 
<br>

		<!-- Search form -->
	<h3><u>Search Fonctionality :</u></h3> 
	<br>
	<form method="get">
		<div class="form-group">
			<label for="libelle">Libelle :</label>
			<input type="text" name="bean.libelle" class="form-control" placeholder="Entrez un libelle"/><br>
			<s:submit cssClass="btn btn-info btn-md form-control" action="searchFonct" value="Search" />
		</div>

	</form>
	<br>
	

<!-- Listing records -->  
	<h3><u>Listement des fonctionnalites enregistré :</u></h3> 
	<br>
	<table class="table table-striped table-hover">
  		<thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Libelle</th>
		      <th scope="col">Description</th>
    		</tr>
  		</thead>
  		<tbody>
		  <s:iterator value="foncts">
			    <tr>
			      <th scope="row"><s:property value="id"/></th>
			      <td><s:property value="libelle"/></td>
			      <td><s:property value="description"/></td>

			      	<s:url namespace="/fonct" action="getFonct" id="lien1">
			      		<s:param name="idFonct">
			      			<s:property value="id"/>
			      		</s:param>
			      	</s:url>
			      	
			      	<s:url namespace="/fonct" action="deleteFonct" id="lien2">
			      		<s:param name="idFonct">
			      			<s:property value="id"/>
			      		</s:param>
			      	</s:url>
			      	
			      	<s:url namespace="/fonct" action="editFonct" id="lien3">
			      		<s:param name="idFonct">
			      			<s:property value="id"/>
			      		</s:param>
			      	</s:url>
			      	

			      <td>
			      	<s:a href="%{lien1}" cssClass="btn btn-sm btn-success">Affecter</s:a>
			      	<s:a href="%{lien2}" cssClass="btn btn-sm btn-danger">Supprimer</s:a>
			      	<s:a href="%{lien3}" cssClass="btn btn-sm btn-warning">Modifier</s:a>
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