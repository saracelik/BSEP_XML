/**
 * 
 */

bespApp.controller('generateController',function($rootScope, $scope,$window, $location,generateFactory){
	
	korisnik = JSON.parse(localStorage.getItem('korisnik'));
	role = JSON.parse(localStorage.getItem('role'));
	console.log(role+ ": moja uloga");
	if (role=='Client'){
		document.getElementById("loginButton").style.visibility = "hidden";
		document.getElementById("logoutButton").style.visibility = "visible";
		document.getElementById("username").style.visibility = "hidden";
		document.getElementById("password").style.visibility = "hidden";
		document.getElementById("admimSettings1").style.visibility = "hidden";
		document.getElementById("admimSettings2").style.visibility = "hidden";
		document.getElementById("admimSettings3").style.visibility = "hidden";
		document.getElementById("admimSettings4").style.visibility = "hidden";
		document.getElementById("admimSettings5").style.visibility = "hidden";
		document.getElementById("registrationId").style.visibility = "hidden";


		
	}else if (role=='Employee'){
		document.getElementById("loginButton").style.visibility = "hidden";
		document.getElementById("logoutButton").style.visibility = "visible";
		document.getElementById("username").style.visibility = "hidden";
		document.getElementById("password").style.visibility = "hidden";
		document.getElementById("admimSettings1").style.visibility = "hidden";
		document.getElementById("admimSettings2").style.visibility = "hidden";
		document.getElementById("admimSettings3").style.visibility = "hidden";
		document.getElementById("admimSettings4").style.visibility = "hidden";
		document.getElementById("admimSettings5").style.visibility = "hidden";
		document.getElementById("registrationId").style.visibility = "hidden";

	}else if (role=='Administrator'){
		document.getElementById("loginButton").style.visibility = "hidden";
		document.getElementById("logoutButton").style.visibility = "visible";
		document.getElementById("username").style.visibility = "hidden";
		document.getElementById("password").style.visibility = "hidden";
		document.getElementById("admimSettings1").style.visibility = "visible";
		document.getElementById("admimSettings2").style.visibility = "visible";
		document.getElementById("admimSettings3").style.visibility = "visible";
		document.getElementById("admimSettings4").style.visibility = "visible";
		document.getElementById("admimSettings5").style.visibility = "visible";
		document.getElementById("registrationId").style.visibility = "hidden";

	}else if (role==null){
		document.getElementById("loginButton").style.visibility = "visible";
		document.getElementById("logoutButton").style.visibility = "hidden";
		document.getElementById("username").style.visibility = "visible";
		document.getElementById("password").style.visibility = "visible";
		document.getElementById("admimSettings1").style.visibility = "hidden";
		document.getElementById("admimSettings2").style.visibility = "hidden";
		document.getElementById("admimSettings3").style.visibility = "hidden";
		document.getElementById("admimSettings4").style.visibility = "hidden";
		document.getElementById("admimSettings5").style.visibility = "hidden";
		document.getElementById("registrationId").style.visibility = "visible";

	}

	
	
	$scope.loginClick = function(){
		userName = $scope.userName;
		password = $scope.password;
		user = {'email' : userName, 'password' : password};
		console.log(userName+ ": moja uloga");

		if (!userName || !password) {
			alert("Morate unijeti korisnicko ime i lozinku!");
		}
		else {
			
			console.log("usao u else");

			generateFactory.login(user).then(function(response){
				console.log("usao u login");
				if(response.status==200){
					console.log("status logina je 200");
					
					$rootScope.korisnik = response.data;
					korisnik = response.data;
					localStorage.setItem('korisnik', JSON.stringify(korisnik));
					
					auth = response.data.authorities;
					console.log(auth);
					//localStorage.setItem('role', JSON.stringify(authorities));
					
					document.getElementById("loginButton").style.visibility = "hidden";
					document.getElementById("logoutButton").style.visibility = "visible";
					document.getElementById("username").style.visibility = "hidden";
					document.getElementById("password").style.visibility = "hidden";
					if (role=='Administrator'){
						document.getElementById("admimSettings1").style.visibility = "visible";
						document.getElementById("admimSettings2").style.visibility = "visible";
						document.getElementById("admimSettings3").style.visibility = "visible";
						document.getElementById("admimSettings4").style.visibility = "visible";
						document.getElementById("admimSettings5").style.visibility = "visible";
					} else{
						document.getElementById("admimSettings1").style.visibility = "hidden";
						document.getElementById("admimSettings2").style.visibility = "hidden";
						document.getElementById("admimSettings3").style.visibility = "hidden";
						document.getElementById("admimSettings4").style.visibility = "hidden";
						document.getElementById("admimSettings5").style.visibility = "hidden";
					}
				} 
				else {
					
				}
			}).catch(function(response) {
				alert("Korisnik ne postoji");
				$scope.userName=" ";
				$scope.password = "";
			  });
		}
	};
	
	$scope.logoutClick = function() {
		localStorage.removeItem('korisnik');
		localStorage.removeItem('role');
		generateFactory.logout().then(function(response){
			console.log("Uspjesno odjavljen");
			document.getElementById("loginButton").style.visibility = "visible";
			document.getElementById("logoutButton").style.visibility = "hidden";
			document.getElementById("username").style.visibility = "visible";
			document.getElementById("password").style.visibility = "visible";
			document.getElementById("admimSettings1").style.visibility = "hidden";
			document.getElementById("admimSettings2").style.visibility = "hidden";
			document.getElementById("admimSettings3").style.visibility = "hidden";
			document.getElementById("admimSettings4").style.visibility = "hidden";
			document.getElementById("admimSettings5").style.visibility = "hidden";
			document.getElementById("registrationId").style.visibility = "visible";
		});
	};
	
	$scope.caCertificate = function() {
	    generateFactory.caCertificate().then(
	      function(response) {
	       $scope.caCertificate = response.data;
	      });
	   }
	
	
	$scope.generateCertificate= function(){
		
		generateFactory.generateCertificate($scope.cert).then(function(response){
    		if(response.status == 200){
    			alert("USPJESNO GENERISANJE!");
    			$scope.error = false;
    			//$location.path('/index');
    			$scope.cert = null;
    		} else {
    			$scope.error = true;
    		}
    	});
	}

	$scope.statusCertificate = function() {
		generateFactory.statusCertificate($scope.serial).then(
	      function(response) {
	      $scope.status = response.data; 
	      });
	   }
	
$scope.generateCRSCertificate= function(){
		
	    generateFactory.generateCRSCertificate($scope.ccrs).then(function(response){
    		if(response.status == 'OK'){
    			alert("USPJESNO GENERISANJE!");
				
    			$scope.error = false;
    			//$location.path('/index')
    			$scope.cert = null;
    		} else {
    			$scope.error = true;
    		}
    	});
	}
	
	
    $scope.getCertificate = function(){
		
    	generateFactory.getCertificate($scope.serial).then(function(response){
    		
    	});
	}	
	
    $scope.delCertificate = function(){
		
    	generateFactory.delCertificate($scope.serial).then(function(response){
    		if(response.status == 'BAD_REQUEST'){
    			$scope.status = 'Ne postoji sertifikat sa tim serijskim brojem!';
    		}
    		else {
    			
    		}
    	});
	}
  
    $scope.statusCertificate = function() {
    	generateFactory.statusCertificate($scope.serial).then(
	      function(response) {
	      $scope.status = response.data; 
	      });
	   };
	

});

bespApp.controller('registrationController',function($rootScope, $scope,$window, $location,generateFactory){

	$scope.registrationClick = function(){
		firstName = $scope.firstName;
		lastName  = $scope.lastName;
		email = $scope.email;
		password = $scope.password;
		
		if (!firstName || !lastName || !email || !password) {
			alert("Sva polja moraju biti popunjena!");
		}
		else {
		}
	};

});