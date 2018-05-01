<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="includes/_header.jsp"/>

<!-- Begin page content -->
	
	<script type="text/javascript" >
		
		function ajouter(){
			this.document.f.action="./add.action";
			this.document.f.submit();
		}
		
		function lister(){
			this.document.f.action="./listAll.action";
			this.document.f.submit();
		}
		
		function listExport(){
			this.document.f.action="./listExport.action";
			this.document.f.submit();
		}
		
	</script>
	
	<div class="container">
			<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">I</span>ndex<span style="font-size:40px;color:#0abde3"> P</span>rofil</h3><br><hr width="50%"> 
			<br>
		<div class="row">
			
    		
			<div class="col-md-12">
			<form name="f" method="post">
				<div class="row">
					<div class="col-lg-2">
						<div class="form-group">
							<input type="submit" class="btn btn-info btn-md form-control" onclick="lister()" value="Editer Profils"/>
						</div>	
					</div>
					<div class="col-lg-2">
						<div class="form-group">
							<input type="submit" class="btn btn-primary btn-md form-control" onclick="listExport()" value="Lister Profils"/>
						</div>
					</div>

				</div>
	
			<h3><u>Ajouter Profil :</u></h3> 
			<br>

					<div class="form-group">
						<label for="libelle">Libelle :</label>
						<input type="text" name="libelle" class="form-control" placeholder="Entrez le libelle"/>
					</div>
					<div class="form-group">
						<label for="libelle">Description :</label>
						<input type="text" name="descProfil" class="form-control" placeholder="Entrez la description"/>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary btn-md form-control" onclick="ajouter()"/><i class="glyphicon glyphicon-user"></i>
					</div>
					
				</form>
			</div>
		</div>
		<br/><br/>
		<hr width="50%"> 
	</div>	
<!-- footer -->	
<jsp:include page="includes/_footer.jsp"/>