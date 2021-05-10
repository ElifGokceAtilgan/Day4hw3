package hw4.concretes;

import hw4.abstracts.CampaignService;
import hw4.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign Saved " + campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign Deleted " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign Updated " + campaign.getName());
	}

}
