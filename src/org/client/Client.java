
package org.client;

import org.company.*;

public class Client extends Company{
	public void ClientName() {
		System.out.println("suba");
	}
	public static void main(String[]args) {
		Client c=new Client();
		c.ClientName();
		c.cmpName();
	
		
	}
}