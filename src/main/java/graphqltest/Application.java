package graphqltest;

import io.micronaut.runtime.Micronaut;

import io.micronaut.serde.annotation.SerdeImport;

import io.micronaut.configuration.graphql.ws.GraphQLWsResponse;
import io.micronaut.configuration.graphql.GraphQLRequestBody;
import io.micronaut.configuration.graphql.GraphQLResponseBody;


@SerdeImport(GraphQLWsResponse.class)
@SerdeImport(GraphQLRequestBody.class)
@SerdeImport(GraphQLResponseBody.class)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
