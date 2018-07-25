<portlet:resourceURL var="getNearbyStoreInformationURL" id="getNearbyStoreInformation" />

<script type="text/javascript">

var lat = '', lng = '' ;

$( document ).ready(function() {
    console.log( "Ready Location !!" );
    setTimeout(function() {
    	<portlet:namespace/>getLocationLatLng();
	}, 1000)
	var latitude='';
	var longitude='';
    <portlet:namespace/>getNearbyStores(latitude, longitude, null, null);
});

function <portlet:namespace/>getLocationLatLng(){
	lat = getCookie("currentLocationLat");
	lng = getCookie("currentLocationLng");
	if(lat === null && lng === null){
		if (navigator.geolocation){				
				console.log('window.navigator.geolocation : '+window.navigator.geolocation);
				window.navigator.geolocation.getCurrentPosition(userLocationFound, userLocationNotFound, geoOptions);
	     }else{
	    	viewSearchResultServices
			alert("Geolocation is not supported by this browser.");
		}	
	 } 
}


var latLng,
geoOptions = {
    enableHighAccuracy: false,
    timeout: 5000, // Wait 5 seconds
    maximumAge: 300000 //  Valid for 5 minutes
};

var userLocationFound = function(position){
latLng = {
    lat: position.coords.latitude,
    lng: position.coords.longitude
};


var latlng = null;
var lat = null;
var lng = null;
var locationText = null;
lat = parseFloat(latLng.lat);
lng = parseFloat(latLng.lng);

document.cookie="currentLocationLat=" + lat;
document.cookie="currentLocationLng=" + lng;


var latlng = new google.maps.LatLng(lat, lng);
var geocoder = geocoder = new google.maps.Geocoder();

geocoder.geocode({ 'latLng': latlng }, function (results, status) {
	if (status == google.maps.GeocoderStatus.OK) {
		if (results[1]) {
			document.cookie="locationText=" + results[1].formatted_address;			
		}
	}
});
}

var userLocationNotFound = function(){    

var lats='';
var lngs='';
var locationText = '';
$.get("http://ipinfo.io", function (response)
{
    lats = response.loc.split(',')[0]; 
    lngs = response.loc.split(',')[1];
    
    var lat = parseFloat(lats);
    var lng = parseFloat(lngs);
       
    var cookieLat = '', cookieLng = '' ;
    cookieLat = getCookie("currentLocationLat");
    cookieLng = getCookie("currentLocationLng");
    if(cookieLat === null && cookieLng === null){
	 	document.cookie="currentLocationLat=" + lat;
	    document.cookie="currentLocationLng=" + lng;
    }
    
    var latlng = new google.maps.LatLng(lat, lng);
    var geocoder = geocoder = new google.maps.Geocoder();
    geocoder.geocode({ 'latLng': latlng }, function (results, status) {
        if (status == google.maps.GeocoderStatus.OK) {
            if (results[1]) {
            	var cookieLocationText = '';
            	cookieLocationText = getCookie("locationText");
            	if(cookieLocationText === null){
            		document.cookie="locationText=" + results[1].formatted_address;
            	}
            }
        }
    });
}, "jsonp");
}



setTimeout(function () {
if(!latLng){
    userLocationNotFound();
}else{
   // alert("Location was set");
}
}, geoOptions.timeout + 1000); // Wait extra second

function getCookie(name){
  var re = new RegExp(name + "=([^;]+)");
  var value = re.exec(document.cookie);
  return (value != null) ? unescape(value[1]) : null;
}

function <portlet:namespace />getNearbyStoreLocation(){
	var unit = $("#<portlet:namespace />distanceUnit option:selected").val();
	var distance = $("#<portlet:namespace />distance").val();
	<portlet:namespace/>getNearbyStores(lat, lng, unit, distance);
}

function <portlet:namespace/>getNearbyStores(lat, lng, unit, distance){

	$.ajax({
	    url :"<%=getNearbyStoreInformationURL%>",
	    data:{
	    	<portlet:namespace />lattitude: lat,
	    	<portlet:namespace />longitude: lng,
	    	<portlet:namespace />unit: unit,
	    	<portlet:namespace />distance: distance
	    },
	    success: function(data){
	    	var content= JSON.parse(data);
	    	
	    	if(content.storeLocationResult.length>0){
	    		$("#map").show();
	    		$("#noOfRecords").text(content.storeLocationResult.length +' records found !!!');
		    	resultAppear(content.lats, content.lngs, content.storeLocationResult);
		    	$( "#addressInformation" ).empty();
		    	 $.each( content.storeLocationResult, function( key, value ) {
		    		 
		    		 var addressInformation = document.createElement("div");
		    		 addressInformation.setAttribute("class", "col-md-6");
		    		 
		    		 var storeName = document.createElement("div");  // Create with DOM
		    		 storeName.innerHTML = value.storeName.bold();
		 	    	 addressInformation.append(storeName);
	
		 	    	var address1 = document.createElement("div");  // Create with DOM
		 	    	address1.innerHTML = value.address1;
		 	    	addressInformation.append(address1); 
		 	    	
		 	    	var city = document.createElement("div");  // Create with DOM
		 	    	city.innerHTML = value.city;
		 	    	addressInformation.append(city);
		 	    	
		 	    	var state = document.createElement("div");  // Create with DOM
		 	    	state.innerHTML = value.state;
		 	    	addressInformation.append(state);
	
		 	    	var country = document.createElement("div");  // Create with DOM
		 	    	country.innerHTML = value.country;
		 	    	addressInformation.append(country);
		 	    	
		 	    	var zip = document.createElement("div");  // Create with DOM
		 	    	zip.innerHTML = value.zip;
		 	    	addressInformation.append(zip);
		 	    	
		 	    	$("#addressInformation").append(addressInformation);
		    	 });
		    	 $("#addressInformation").customScrollbar({
		    		  skin: "default-skin", 
		    		  hScroll: false,
		    		  updateOnWindowResize: true
		    		  });
		    	 $("#noRecords").hide();
		    	return false;	
			}else{
				$("#noOfRecords").empty();
				$("#addressInformation").empty();
				$("#noRecords").show();
				$("#map").hide();
			}
	    }
	});	
}

function resultAppear(latitude, longitude, searchLocationResult){
	
	 var locations = [];
	$.each( searchLocationResult, function( key, value ) {
		locations.push({
			lat:Number(value.latitude), 
			lng:Number(value.longitude),
			storeName:value.storeName,
			address1:value.address1,
			city:value.city,
			state:value.state,
			country:value.country,
			zip:value.zip,
			phone:value.phone
        });	
	});	
	
	setTimeout(function() {
		initMap(latitude, longitude, searchLocationResult, locations);
	}, 1000)
	
}

function initMap(latitude, longitude, searchLocationResult, locations) {

	if(latitude === 0 && longitude === 0){
		console.log('lat and long is 0');
		console.log('Latitude :: '+locations[0].lat);
		console.log('Longitude :: '+locations[0].lng);
		latitude = locations[0].lat;
		longitude = locations[0].lng;
	}
	
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 3,
      center: {lat: Number(latitude), lng: Number(longitude)}
    });
    
    if(map == 'undefined'){
    	alert('map is undefined');
    }

    // Create an array of alphabetical characters used to label the markers.
    var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    
    /* $.each(locations, function (index, value) {
	    console.log('Latitude => '+ value.lat + ' Longitude => ' + value.lng);
	}); */ 
    
    var infowindow = new google.maps.InfoWindow();
	var marker, i;
    var markers = locations.map(function(location, i) {
        marker = new google.maps.Marker({
          position: location,
          label: labels[i % labels.length],
          title: location.storeName
        });
        
        google.maps.event.addListener(marker, 'click', (function(marker, i) {
   	     return function() {
   	       infowindow.setContent('<div><strong>'+location.storeName+'</div></strong><div>'+location.address1+','+'</div><div>'+location.city+','+'</div><div>'+location.state+','+'</div><div>'+location.country+','+'</div><div>'+location.zip+'</div><div> Phone : '+location.phone+'</div>' );
   	       infowindow.open(map, marker);
   	     }
   	   })(marker, i));
        
        return marker;
    });
    
    // Add a marker clusterer to manage the markers.
    var markerCluster = new MarkerClusterer(map, markers,
        {imagePath: 'https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m'});
  }

</script>