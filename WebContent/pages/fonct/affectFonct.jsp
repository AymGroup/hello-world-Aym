<%@ taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript">

	function affect(){
		this.document.f.action="./fonct/setFonctAffect.action";
		this.docuùent.f.submit();
	}
	
</script>

<div class="container">
<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">A</span>ffecter <span style="font-size:40px;color:#0abde3">F</span>onctionnalite</h3><br><hr width="50%"> 
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
						<s:textfield name="idProfil" cssClass="form-control"></s:textfield>
					</div>
					
					<div class="form-group">
						<input type="submit" class="btn btn-warning btn-md form-control" value="Affecter" onclick="affect()"/>
					</div>
		</form><br>
		
		<h3><u>Les profils disponible :</u></h3>
		
		<display:table name="profils" pagesize="3" requestURI="redirectU.action" class="table table-striped table-hover" >
					<display:column property="id" title="#"></display:column>
					<display:column property="libelle" title="Libelle"></display:column>
					<display:column property="description" title="Description"></display:column>
		</display:table> 
		
<br><br>
	<hr width="50%"> 	

</div>

<!-- footer -->	
<jsp:include page="../includes/_footer.jsp"/>