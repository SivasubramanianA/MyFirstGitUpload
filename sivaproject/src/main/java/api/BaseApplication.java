package api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/myapi")
public class BaseApplication extends Application{

	private Set<Object> singletons = new HashSet<>();

	public BaseApplication() {
		singletons.add(new BaseResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
