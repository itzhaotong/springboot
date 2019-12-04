var app=angular.module('mxd', []);//定义模块
app.controller('initController',function($scope,$window,MxdPictureService){
	$scope.page = 0;
	$scope.totalPage = 0;
	$scope.init = function(){
		MxdPictureService.getList($scope.page).success(
				function(response){
					$scope.Date = response.data
					$scope.totalPage = response.totalPage
				}
		)
	}
	
	$scope.getList = function(page){
		MxdPictureService.getList(page).success(
				function(response){
					$scope.Date = response.data
					$scope.totalPage = response.totalPage
				}
		)
	}
	$scope.previousPage = function(){
		if($scope.page >= 0){
			alert("第一页!")
		}else{
			$scope.page = $scope.page -1
			$scope.getList($scope.page);
		}
	}
	$scope.nextPage = function(){
		if($scope.page <= $scope.totalPage ){
			alert("最后一页了!")
		}else{
			$scope.page = $scope.page +1
			$scope.getList($scope.page);
		}
	}
})