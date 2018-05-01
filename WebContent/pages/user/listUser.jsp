<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>

<!-- Begin page content -->

<div class="container">
	<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">L</span>ister <span style="font-size:40px;color:#0abde3">U</span>sers</h3><br><hr width="50%"> 
	<br>
	
	<!-- Listing records - Display Tag -->  
	<h3><u>Listement des users enregistré :</u></h3> 
	<br>
				<display:table name="users" pagesize="3" requestURI="listerUser.action" export="true" class="table table-striped table-hover" >
					<display:column property="id" title="#"></display:column>
					<display:column property="login" title="Login" sortable="true"></display:column>
					<display:column property="password" title="Password"></display:column>
					<display:column property="profil.id" title="#Profil"></display:column>
			    </display:table> 
			
	<br><br>
	<hr width="50%"> 
	
</div>

<!-- footer -->	
<jsp:include page="../includes/_footer.jsp"/>
	