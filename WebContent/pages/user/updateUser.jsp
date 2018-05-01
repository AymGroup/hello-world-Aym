<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript">

	function modifier(){
		this.document.f.action="./updateUser.action";
		this.docuùent.f.submit();
	}
	
</script>

<div class="container">
<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">M</span>odifier <span style="font-size:40px;color:#0abde3">U</span>ser</h3><br><hr width="50%"> 
<br>

		<form name="f" method="post">
					<div class="form-group">
						<label for="libelle">ID :</label>
						<!-- <input type="text" name="bean.id" class="form-control" value=<s:property value="bean.id"/> />-->
						<s:textfield name="bean.id" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Login :</label>
						<!-- <input type="text" name="bean.login" class="form-control" value=<s:property value="bean.login"/> />-->
						<s:textfield name="bean.login" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Password :</label>
						<!-- <input type="text" name="bean.password" class="form-control" value=<s:property value="bean.password"/> /> -->
						<s:textfield name="bean.password" cssClass="form-control"></s:textfield>
					</div>
					<div class="form-group">
						<label for="libelle">Profil ID :</label>
						<input type="text" name="idProfil" class="form-control" value=<s:property value="bean.profil.id"/> />
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