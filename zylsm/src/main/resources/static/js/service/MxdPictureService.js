app.service('MxdPictureService', function($http) {
	//新增 
	this.insert = function(data){
		return $http.post('../mxd/insert',data);
	}
	//查询所有分页
	this.getList = function(page){
		return $http.get('../mxd/getList?page='+page);
	}
	
});