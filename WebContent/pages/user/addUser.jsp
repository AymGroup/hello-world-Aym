<%@ taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->

<script type="text/javascript" >
		function ajouterUser(){
			this.document.fUser.action="./user/add.action";
			this.document.fUser.submit();
		}
		
		function listerUser(){
			this.document.fUser.action="./user/listerUser.action";
			this.document.fUser.submit();
		}
		
		function editerUser(){
			this.document.fUser.action="./user/editerUser.action";
			this.document.fUser.submit();
		}
</script>


<div class="container">
			<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">I</span>ndex<span style="font-size:40px;color:#0abde3"> U</span>ser</h3><br><hr width="50%"> 
			<br>
		<div class="row">
			<div class="col-md-12">
			
			<form name="fUser" method="post">
				<div class="row">
					<div class="col-lg-2">
					<div class="form-group">
						<input type="submit" class="btn btn-info btn-md form-control" onclick="editerUser()" value="Editer Users"/>
					</div>
					</div>
					<div class="col-lg-2">
					<div class="form-group">
						<input type="submit" class="btn btn-primary btn-md form-control" onclick="listerUser()" value="Lister Users"/>
					</div>
					</div>

				</div>
			<h3><u>Ajouter un utilisateur :</u></h3>
			<br>
					
					<div class="form-group">
        				<s:textfield name="bean.login" label="Name" cssClass="form-control"></s:textfield>  
        			</div>
        			<div class="form-group">
        				<s:textfield name="bean.password" label="Password" cssClass="form-control" ></s:textfield>  
        			</div>
        			<div class="form-group">
        				<s:textfield name="idProfil" label="Profil ID" cssClass="form-control" ></s:textfield>  
					</div>		
					<div class="form-group">
						<input type="submit" class="btn btn-primary btn-md form-control" onclick="ajouterUser()"/>
						<!--<s:submit method="ajouterUser" value="Ajouter" />-->
					</div>
						
				</form>
    			
			</div>
		</div><br>
			    
			    
			    <display:table name="profils" pagesize="3" requestURI="redirectU.action" class="table table-striped table-hover" >
					<display:column property="id" title="#"></display:column>
					<display:column property="libelle" title="Libelle"></display:column>
					<display:column property="description" title="Description"></display:column>
			    </display:table> 
			    
	<br/><br/><br/>
	<hr width="50%"> 
	
</div>	

<jsp:include page="../includes/_footer.jsp"/>