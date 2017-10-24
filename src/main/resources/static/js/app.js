'use strict';

var coursesApp = angular.module('coursesApp', [

    'ui.router',
    'ui.bootstrap',

    'coursesControllers'
]);


coursesApp.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise("/home");

    $stateProvider
        .state('home', {
            url: "/home",
            templateUrl: "partials/kinetic.html",
            controller: "HomeCtrl"
        });

});

