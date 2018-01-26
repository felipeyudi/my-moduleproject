function Request() {
}

Request.prototype.ola = function(texto) {
	console.log("ola ",texto);
}

Request.prototype.get = function(url, param, callback) {
    $.get(url, param, function( data ) {
    	callback(data);
    });
}
var Request = new Request();