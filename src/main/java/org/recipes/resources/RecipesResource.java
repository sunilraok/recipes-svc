package org.recipes.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Path("/recipes")
@Produces(MediaType.APPLICATION_JSON)
public class RecipesResource {
    Map<String, String> recipes = new HashMap<>() {{
        put("1", "Masala Dosa");
        put("2", "Rava Dosa");
    }};

    public RecipesResource() {}

    @GET
    @Path("/{id}")
    public String getRecipe(@PathParam("id") String id) {
        return recipes.get(id);
    }

    @GET
    public Collection<String> getAllRecipes() {
        return recipes.values();
    }
}
