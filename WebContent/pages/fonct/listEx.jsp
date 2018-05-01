<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>

<!-- Begin page content -->

<div class="container">
	<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">L</span>ister <span style="font-size:40px;color:#0abde3">F</span>onctionnalite</h3><br><hr width="50%"> 
	<br>
	
	<!-- Listing records - Display Tag -->  
	<h3><u>Listement des fonctionnalit�s enregistr� :</u></h3> 
	<br>
				<display:table name="foncts" pagesize="3" requestURI="listerExport.action" export="true" class="table table-striped table-hover" >
					<display:column property="id" title="#"></display:column>
					<display:column property="libelle" title="Libelle" sortable="true"></display:column>
					<display:column property="description" title="Description"></display:column>
			    </display:table> 
			
	<br><br>
	<hr width="50%"> 
	
</div>

<!-- footer -->	
<jsp:include page="../includes/_footer.jsp"/>
	