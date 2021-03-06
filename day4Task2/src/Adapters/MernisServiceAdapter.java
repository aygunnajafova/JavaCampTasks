package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			result = false;
			e.printStackTrace();
		}

		return result;
	}

}
