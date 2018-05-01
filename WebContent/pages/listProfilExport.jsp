<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="includes/_header.jsp"/>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>


<!-- Begin page content -->

<div class="container">
	<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">L</span>ister <span style="font-size:40px;color:#0abde3">P</span>rofils</h3><br><hr width="50%"> 
	<br>
	
	<!-- Listing records - Display Tag -->  
	<h3><u>Listement des profils enregistré :</u></h3> 
	<br>
				<display:table name="profils" pagesize="3" requestURI="listExport.action" export="true" class="table table-striped table-hover" >
					<display:column property="id" title="#"></display:column>
					<display:column property="libelle" title="Libelle" sortable="true"></display:column>
					<display:column property="description" title="Description"></display:column>
			    </display:table> 
			
	<br><br>
	<hr width="50%"> 
	
</div>

<!-- footer -->	
<jsp:include page="includes/_footer.jsp"/>
	
