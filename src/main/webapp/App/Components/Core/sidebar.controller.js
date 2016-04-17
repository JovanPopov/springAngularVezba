(function(){

	angular.module('app.core').controller('SideBarController', sidebarcontroller);
	
	function sidebarcontroller($location){
		var sbc=this;
		sbc.isActive= function(path){
			var active = (path === $location.path());
     			return active;

		}

	}


})();