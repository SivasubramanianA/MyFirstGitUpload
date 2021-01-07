package api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/message")
public class BaseResource {

	BaseService baseService = new BaseService();
	
	
//	@GET
//	@Produces("application/json")
//	@Path("/getmessages")
//	public List<Base> getMessages() {
//		return baseService.getAllMessages();
//	}
	
	@GET
    @Path("/get")
    @Produces("application/json")
	public Base produceJSON(String name) {
		Base b1 = new Base(1L, "Hi", "Siva");
		return b1;
	}
	
	@POST
    @Path("/post")
    @Consumes("application/json")
    public Response createJSON(Base b1) {

        String result = "Value is  : " + b1;
        return Response.status(201).entity(result).build();
	}
	
	@GET
	@Path("/{key}")
	public String getData(@PathParam("key") String Key, @QueryParam("data") String data) {
		return Key+data;
	}
	
	//Post in Text Format
	@POST
	@Path("/textbody")
	public String postDataText(String data) {
		return "The value of text is : " + data;
	}
		
	//Post in JSON Format
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/jsonbody")
	public GettingData postDataJson(GettingData data) {
		return data;
	}
}

