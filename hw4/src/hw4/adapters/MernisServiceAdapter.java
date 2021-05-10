package hw4.adapters;

import hw4.abstracts.GamerCheckService;
import hw4.entities.Gamer;
import MernisServiceReference.KPSPublicSoapProxy;


public class MernisServiceAdapter implements GamerCheckService {


	 @Override
	 
	 public boolean checkIfRealPerson(Gamer gamer) {
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			
			boolean result = false;
			
			try {
				result = kpsPublicSoapProxy.TCKimlikNoDogrula(
						Long.parseLong(gamer.getNationalityId()),
						gamer.getFirstName().toUpperCase(),
						gamer.getLastName().toUpperCase(),
						gamer.getDateOfBirth().getYear());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
			return result;
		}

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	   
     /*public boolean CheckIfRealPerson(Gamer gamer) throws Exception {
	 KPSPublicSoapProxy player = new KPSPublicSoapProxy();
	        return player.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),
	                gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),
	                gamer.getDateOfBirth().getYear());*/

	
}

	

	
