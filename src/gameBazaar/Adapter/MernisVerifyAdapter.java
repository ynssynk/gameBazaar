package gameBazaar.Adapter;

import java.rmi.RemoteException;

import gameBazaar.Abstract.UserVerifyService;
import gameBazaar.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisVerifyAdapter implements UserVerifyService {

	@Override
	public boolean verifyUser(User user) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			
			result=client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName(),user.getLastName(), user.getDateOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
