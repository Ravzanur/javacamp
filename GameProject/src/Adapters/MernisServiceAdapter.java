package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId(), 10), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return false;
	}

}
