package hw4.abstracts;

import hw4.entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);

	boolean CheckIfRealPerson(Gamer gamer) throws Exception;
}
