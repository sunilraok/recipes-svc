package org.recipes;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.recipes.resources.RecipesResource;

public class RecipesApplication extends Application<RecipesConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RecipesApplication().run(args);
    }

    @Override
    public String getName() {
        return "RecipesApplication";
    }

    @Override
    public void initialize(final Bootstrap<RecipesConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RecipesConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        RecipesResource resource = new RecipesResource();
        environment.jersey().register(resource);
    }
}
