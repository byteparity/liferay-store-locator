<script type="text/javascript">
function initMap() {
   var input = document.getElementById('<portlet:namespace/>storeArea');
   var autocomplete = new google.maps.places.Autocomplete(input);
   autocomplete.addListener('place_changed', function() {
   var place = autocomplete.getPlace();
	$("#<portlet:namespace/>latitude").val(place.geometry.location.lat());
	$("#<portlet:namespace/>longitude").val(place.geometry.location.lng());
	
	$("#<portlet:namespace/>address1").val("");
	$("#<portlet:namespace/>address2").val("");
	$("#<portlet:namespace/>city").val("");
	$("#<portlet:namespace/>state").val("");
	$("#<portlet:namespace/>country").val("");
	$("#<portlet:namespace/>zip").val("");
	
	var components = place.address_components;
	var location = null;
    for (var i = 0, component; component = components[i]; i++) {
        console.log(component);
         if (component.types[0] == 'route') {
        	 location = component['long_name'];
            $("#<portlet:namespace/>address1").val(location);
        }
        if (component.types[0] == 'sublocality_level_1') {
        	
        	location = component['long_name'];
        	$("#<portlet:namespace/>address2").val(location);
            
        }
      
        if (component.types[0] == 'administrative_area_level_2') {
        
        	location = component['long_name'];
            $("#<portlet:namespace/>city").val(location);
            
        }
        if (component.types[0] == 'administrative_area_level_1') {
        	
        	location = component['long_name'];
            $("#<portlet:namespace/>state").val(location);
            
        }
        if (component.types[0] == 'country') {
        	
        	location = component['long_name'];
        	$("#<portlet:namespace/>country").val(location);
            
        }
        
		if (component.types[0] == 'postal_code') {
        	
			location = component['long_name'];
			$("#<portlet:namespace/>zip").val(location);
            
        }
    }
   });
}
 </script>