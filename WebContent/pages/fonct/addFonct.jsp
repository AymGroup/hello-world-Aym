<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="../includes/_header.jsp"/>

<!-- Begin page content -->
	
	<script type="text/javascript" >
		
		function addFonct(){
			this.document.f.action="./fonct/addFonct.action";
			this.document.f.submit();
		}
		
		function listerFonct(){
			this.document.f.action="./fonct/listerFonct.action";
			this.document.f.submit();
		}
		
		function listerExport(){
			this.document.f.action="./fonct/listerExport.action";
			this.document.f.submit();
		}
		
	</script>
	
<div class="container">
			<h3 style="text-align: center;"><span style="font-size:40px;color:#0abde3">I</span>ndex<span style="font-size:40px;color:#0abde3"> F</span>unctionality</h3><br><hr width="50%"> 
			<br>
		<div class="row">
		
		<div class="col-md-12">
			<form name="f" method="post">
				<div class="row">
				
					<div class="col-lg-2">
						<div class="form-group">
							<input type="submit" class="btn btn-info btn-md form-control" onclick="listerFonct()" value="Editer Fonction"/>
						</div>	
					</div>
					<div class="col-lg-2">
						<div class="form-group">
							<input type="submit" class="btn btn-primary btn-md form-control" onclick="listerExport()" value="Lister Fonction"/>
						</div>
					</div>

				</div>
				
			<h3><u>Ajouter Fonctionnalite :</u></h3> 
			<br>

					<div class="form-group">
						<label for="libelle">Libelle :</label>
						<input type="text" name="bean.libelle" class="form-control" placeholder="Entrez le libelle"/>
					</div>
					<div class="form-group">
						<label for="libelle">Description :</label>
						<input type="text" name="bean.description" class="form-control" placeholder="Entrez la description"/>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary btn-md form-control" onclick="addFonct()"/><i class="glyphicon glyphicon-user"></i>
					</div>
					
				</form>
			</div>
		</div>
		
		<br/><br/>
		<hr width="50%"> 
	</div>	
<!-- footer -->	
<jsp:include page="../includes/_footer.jsp"/>