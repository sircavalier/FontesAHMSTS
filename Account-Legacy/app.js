var app = angular.module('AccountApp', []);
app.run(["$locale", function ($locale) {
    $locale.NUMBER_FORMATS.GROUP_SEP = ".";
    $locale.NUMBER_FORMATS.DECIMAL_SEP = ",";
}]);
app.controller('SummaryCtrl', function($http) {
    var vm = this;

    $http({method: 'GET',
    url:'http://localhost:8081/v1/account/summary',
    headers:{'Access-Control-Allow-Credentials':'true',
       'Access-Control-Allow-Headers':'Content-Type, X-Request-With, X-Requested-By',
       'Access-Control-Allow-Methods':'GET, OPTIONS',
       'Access-Control-Allow-Origin':'*'}}).then(function(response) {
        vm.records = response.data;
    });
});

app.filter('total', function () {
    return function (input, property) {
        var i =  input.length;
            var total = 0;
            while (i--)
                total += input[i][property];
            return total;
        }
});

// here we define our unique filter
app.filter('unique', function() {
    // we will return a function which will take in a collection
    // and a keyname
    return function(collection, keyname) {
       // we define our output and keys array;
       var output = [], 
           keys = [];
       
       // we utilize angular's foreach function
       // this takes in our original collection and an iterator function
       angular.forEach(collection, function(item) {
           // we check to see whether our object exists
           var key = item[keyname];
           // if it's not already part of our keys array
           if(keys.indexOf(key) === -1) {
               // add it to our keys array
               keys.push(key); 
               // push this item to our final output array
               output.push(item);
           }
       });
       // return our array which should be devoid of
       // any duplicates
       return output;
    };
 });