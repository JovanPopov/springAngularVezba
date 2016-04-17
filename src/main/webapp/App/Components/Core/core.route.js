(function(){
	angular.module('app.core').config(config);

	function config($stateProvider, $urlRouterProvider){
			$urlRouterProvider.otherwise('/home');

			$stateProvider
				.state('main',{
					abstract:true,
					views:{
						'navbar':{
							templateUrl: 'App/Components/Core/Navbar.view.html'
						},
						'sidebar':{

							templateUrl: 'App/Components/Core/Sidebar.view.html',
							controller: 'SideBarController',
							controllerAs: 'sbc'
						}
					}
					})

					.state('main.home',{
					url: '/home',
						views:{
							'main@':{
								templateUrl:'App/Components/Core/Home.html'
							}
						}
					})


					.state('main.mark',{
					url: '/mark',
						views:{
							'main@':{
								templateUrl:'App/Components/Core/Mark.view.html',
									controller: 'MarkController',
									controllerAs: 'mc'
							}
						}
					})



					.state('main.fabian',{
					url: '/fabian',
						views:{
							'main@':{
								templateUrl:'App/Components/Core/Fabian.view.html'
							}
						}
					})


	}



})();