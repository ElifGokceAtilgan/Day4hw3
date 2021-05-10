package hw4.concretes;

import hw4.abstracts.GamerCheckService;
import hw4.abstracts.GamerService;
import hw4.entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer Saved : " + gamer.getFirstName() + gamer.getLastName());
		}else {
			System.out.println("ERROR");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer Deleted " + gamer.getFirstName() + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer Deleted " + gamer.getFirstName()+ gamer.getLastName());
	}

}
