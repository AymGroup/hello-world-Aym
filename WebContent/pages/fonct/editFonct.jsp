<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript">

	function modifier(){
		this.document.f.action="./fonct/updateFonct.action";
		this.docuùent.f.submit();
	}
	
</script>

<div class="container">
<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">M</span>odifier <span style="font-size:40px;color:#0abde3">F</span>onctionnalite</h3><br><hr width="50%"> 
<br>

		<form name="f" method="post">
					<div class="form-group">
						<label for="libelle">ID :</label>
						<s:textfield name="bean.id" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Libelle :</label>
						<s:textfield name="bean.libelle" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Description :</label>
						<s:textfield name="bean.description" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">ID Profil :</label>
						<s:textfield name="bean.profils.id" cssClass="form-control"></s:textfield>
					</div>
					
					<div class="form-group">
						<input type="submit" class="btn btn-warning btn-md form-control" value="Modifier" onclick="modifier()"/>
					</div>
		</form>
		
<br><br>
	<hr width="50%"> 	

</div>

<!-- footer -->	
<jsp:include page="../includes/_footer.jsp"/>