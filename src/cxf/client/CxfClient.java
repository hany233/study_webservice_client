package cxf.client;

import cxf.Cat;
import cxf.User;
import cxf.WsInterface;
import cxf.impl.Testws;

public class CxfClient {
	public static void main(String[] args) {
		Testws testws = new Testws();
		WsInterface ws = testws.getWsImplPort();
		System.out.println(ws.hello("fortune"));
		User user = new User();
		user.setName("han");
		user.setPass("password");
		for (Cat cat : ws.getCatByUser(user)) {
			System.out.println(cat.getName());
		}
	}
}
