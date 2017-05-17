var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
 $http.get("http://localhost:8089/Crud/displayall")
  .then(function(response) {
      $scope.names= response.data;
  });
 $scope.orderByMe = function(x) {
		$scope.myOrderBy = x;
	}
});



