package infrastructure.performance.protoproject.resource;
import infrastructure.performance.protoproject.dto.ProtoRequest;
import infrastructure.performance.protoproject.dto.SingleBaseResponse;
import infrastructure.performance.protoproject.service.ProtoProjectService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path(ProtoProjectResourcePath.BASE_PATH)
public class ProtoProjectResource {
    @Inject
    ProtoProjectService protoProjectService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path(ProtoProjectResourcePath.PROTO_V1_PATH)
    public Response getProto () {
        return Response
                .status(200)
                .entity(new SingleBaseResponse("1.0.0","testing","getProto",protoProjectService.protoProcessing(25)))
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(ProtoProjectResourcePath.PROTO_V1_PATH)
    public Response postProto (ProtoRequest protoRequest) {
        return Response
                .status(201)
                .entity(new SingleBaseResponse("1.0.0","testing","postProto",protoProjectService.protoProcessing(protoRequest.params.number)))
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(ProtoProjectResourcePath.PROTO_V1_PATH)
    public Response putProto (ProtoRequest protoRequest) {
        return Response
                .status(201)
                .entity(new SingleBaseResponse("1.0.0","testing","putProto",protoProjectService.protoProcessing(protoRequest.params.number)))
                .build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path(ProtoProjectResourcePath.PROTO_V1_PATH+"/{number}")
    public Response delProto (@PathParam("number")int number) {
        return Response
                .status(201)
                .entity(new SingleBaseResponse("1.0.0","testing","delProto",protoProjectService.protoProcessing(number)))
                .build();
    }
}
