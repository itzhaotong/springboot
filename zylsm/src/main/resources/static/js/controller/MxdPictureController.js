var app=angular.module('mxd', []);//定义模块
app.controller('mxdController',function($scope,$window,MxdPictureService){
	$scope.Data={};
	$scope.save = function(){
		console.log($scope.Data.tetal)
		if($scope.Data.tetal == undefined){
			alert("请填写完整")
			return;
		}
		if($scope.Data.content == undefined){
			alert("请填写完整")
			return;
		}
		if($scope.Data.price == undefined){
			alert("请填写完整")
			return;
		}
		if($scope.Data.pName == undefined){
			alert("请填写完整")
			return;
		}
		$scope.Data.pictureUrl = $('#urls')[0].src
		MxdPictureService.insert($scope.Data).success(
				function(res){
					window.location.href = "index.html"
				}
		)
	}
})
