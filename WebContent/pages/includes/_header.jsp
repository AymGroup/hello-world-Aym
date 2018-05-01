
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/style.css" />
	
	<style type="text/css">
			h1,h2,h3,h4,label{
				font-family: sans-serif;
				color: #636e72;
			}
	
			body{
				background-color: #ffffff;
			}
			
			.dropdown:hover>.dropdown-menu {
	  			display: block;
	  		}
	  </style>
	  
	  <script type="text/javascript">

	  		function redirectP(){
	  				this.document.fr.action="./redirectP.action";
					this.document.fr.submit();
				
			}
	  		
	  		function redirectU(){
				this.document.fr.action="./user/redirectU.action";
				this.document.fr.submit();
			}
	  		
	  		function redirectF(){
	  			this.document.fr.action="./fonct/redirectF.action";
				this.document.fr.submit();
	  		}
	  </script>
	  
	  
</head>
<body>

<br>
<!-- Menu -->
<div class="container">
<form name="fr" method="get">
	<div class="row">
		
			<div class="col-md-4">
	      			<button type="button" class="btn btn-outline-info form-control" onclick="redirectP()">Profil</button>
	    	</div>
	    	<div class="col-md-4">
	     			<button type="button" class="btn btn-outline-info form-control" onclick="redirectF()">Fonctionalite</button>
	    	</div>
	    	<div class="col-md-4">
	      			<button type="button" class="btn btn-outline-info form-control" onclick="redirectU()">Utilisateur</button>
    		</div>
    	
     </div>
     </form>
</div>
  
  
   <!--scripts loaded here-->
  
  <script src="//ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js"></script>
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
  
          
   <br><br>
