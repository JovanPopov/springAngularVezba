(function(){
	
	angular.module('app.core').controller('MarkController', MarkController);
	
	function MarkController($scope,$http){
		var mc=this;
		
		   $http.get('http://localhost:8080/rest/api/images')
	        .success(function (data) {
	            mc.listOfImages = data;

	        })
	        .error(function (data, status, headers, config) {
	            $scope.errorMessage = "Error # " + status;
	        });
		
		
	};
	
})();
