package negocio.ejb.session;

import javax.ejb.Remote;

@Remote
public interface ISessionBeanRemote {
	public void chamadaEJB();
}
