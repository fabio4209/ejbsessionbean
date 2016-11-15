package negocio.ejb.session.impl;

import negocio.ejb.session.ISessionBeanLocal;
import negocio.ejb.session.ISessionBeanRemote;

public class SessionBean implements ISessionBeanRemote, ISessionBeanLocal {
	public void chamadaEJB(){
		System.out.println("Estou dentro do EJB");
	}
}
