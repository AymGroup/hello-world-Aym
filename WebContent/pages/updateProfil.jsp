<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript">

	function modifier(){
		this.document.f.action="./update.action";
		this.docuùent.f.submit();
	}
	
</script>


<div class="container">

<h3>Modifier Profil :</h3> 
<hr> 

		<form name="f" method="post">
					<div class="form-group">
						<label for="libelle">Id Profile :</label>
						<!--  <input type="text" name="numProfil" class="form-control" value=<s:property value="numProfil"/> />-->
						<s:textfield name="numProfil" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Libelle :</label>
						<!-- <input type="text" name="libelle" class="form-control" value=<s:property value="libelle"/> />-->
						<s:textfield name="libelle" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Description :</label>
						<!--  <input type="text" name="descProfil" class="form-control" value=<s:property value="descProfil"/> />-->
						<s:textfield name="descProfil" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-warning btn-md form-control" value="Modifier" onclick="modifier()"/>
					</div>
		</form>
	

</div>



<!-- footer -->	
<jsp:include page="includes/_footer.jsp"/>