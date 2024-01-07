  function updatePhoneModels() {
            var selectedBrand = document.getElementById("pBrand").value;
            var modelSelect = document.getElementById("pModel");
            
            // Define a mapping of brands to models (you can fetch this dynamically from the server)
            var brandToModels = {
                "iphone": ["XR", "Pro", "ProMax"],
                "samsung": ["Galaxy 20 Plus", "Galaxy S20"]
                // Add more brands and their respective models here
            };
            
            // Clear existing options
            while (modelSelect.options.length > 0) {
                modelSelect.options.remove(0);
            }
            
            // Add options for the selected brand
            var models = brandToModels[selectedBrand] || [];
            for (var i = 0; i < models.length; i++) {
                var option = new Option(models[i], models[i]);
                modelSelect.appendChild(option);
            }
        }