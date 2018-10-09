app.controller('signupCtrl', function ($rootScope, $scope, $resource, $location, $http) {
    $scope.user={};
    $scope.validUsername = true;
    $scope.signup = function () {

        // var userResource = $resource('user/new', {}, {add:{method:'POST',responseType:"application/json;charset=UTF-8"}});
        // var userResource = $resource('user/new');
        alert($scope.user.name + "," + $scope.user.pwd);
        // userResource.save({},$scope.user, function (res) {
        //     alert("signup success");
        //     var user = res.data;
        //     $rootScope.user.name=$scope.user.name;
        //     $location.path("/signin");
        // }, function (data) {
        //     alert("signup faliure");
        // });
        $http({
            method:'POST',
            url:'user/new',
            data:$scope.user
        }).then(function (res) {
            alert("signup success");
            var user = res.data;
            $rootScope.user.name=$scope.user.name;
            $location.path("/signin");
        }, function (reason) {
            alert("signup faliure");
        });
    };

    $scope.validName = function () {
        var userResource = $resource('user/:name',{name:$scope.user.name}, {query:{method:'GET',isArray:false}});
        if ($scope.user.name != undefined) {
            userResource.query({name:$scope.user.name}, function (res) {
                if (res.data != null) {
                    $scope.validUsername = false;
                } else {
                    $scope.validUsername = true;
                }
            });
        } else {
            $scope.validUsername = true;
        }
    };

})