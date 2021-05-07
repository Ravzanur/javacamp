package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu sisteme eklendi : " + gamer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu sistemden silindi : " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Güncelleme yapýldý." );
		
	}

}
