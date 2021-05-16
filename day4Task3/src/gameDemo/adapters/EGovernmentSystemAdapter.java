package gameDemo.adapters;

import java.rmi.RemoteException;

import EGovernmentSystem.KPSPublicSoapProxy;
import gameDemo.business.abstracts.GamerCheckService;
import gameDemo.entities.concretes.Gamer;

public class EGovernmentSystemAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		boolean result;
		KPSPublicSoapProxy person = new KPSPublicSoapProxy();
		try {
			result = person.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			result = false;
			e.printStackTrace();
		}

		return result;
	}

}
