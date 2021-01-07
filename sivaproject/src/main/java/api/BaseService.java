package api;

import java.util.ArrayList;
import java.util.List;

public class BaseService {
	
	public List<Base> getAllMessages(){
		Base msg1 = new Base(1L, "Hi", "Siva");
		Base msg2 = new Base(2L, "Hello", "Ajith");
		Base msg3 = new Base(3L, "Hola", "Alan");
		List<Base> list = new ArrayList<>();
		list.add(msg1);
		list.add(msg2);
		list.add(msg3);
		return list;
	}
}
