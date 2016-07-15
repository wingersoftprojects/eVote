/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateEVoteData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = entities.EVotingPersistentManager.instance().getSession().beginTransaction();
		try {
			entities.Group_detail lentitiesGroup_detail = entities.Group_detail.createGroup_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : group_user, group_rights, is_active, group_name
			lentitiesGroup_detail.save();
			entities.User_detail lentitiesUser_detail = entities.User_detail.createUser_detail();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : group_user, is_user_gen_admin, position, second_name, first_name, user_password, user_name
			lentitiesUser_detail.save();
			entities.Group_right lentitiesGroup_right = entities.Group_right.createGroup_right();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, function_name, group_detail
			lentitiesGroup_right.save();
			entities.Vote lentitiesVote = entities.Vote.createVote();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, vote_date_time, candidate, post, vote_name
			lentitiesVote.save();
			entities.Candidate lentitiesCandidate = entities.Candidate.createCandidate();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : vote, is_active, polling_station, post, voter, candidate_name
			lentitiesCandidate.save();
			entities.Post lentitiesPost = entities.Post.createPost();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : vote, candidate, is_active, county, division, district, country, post_name
			lentitiesPost.save();
			entities.Country lentitiesCountry = entities.Country.createCountry();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : post, district, is_active, country_name
			lentitiesCountry.save();
			entities.District lentitiesDistrict = entities.District.createDistrict();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : voter, division_, post, county, is_active, country, district_name
			lentitiesDistrict.save();
			entities.Polling_station lentitiesPolling_station = entities.Polling_station.createPolling_station();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : candidate, voter, is_active, poll_station_name
			lentitiesPolling_station.save();
			entities.Voter lentitiesVoter = entities.Voter.createVoter();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : candidate, finger_print, is_active, district, county, sub_county, parish, polling_station, voter_name
			lentitiesVoter.save();
			entities.Division lentitiesDivision = entities.Division.createDivision();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : post, is_active, district
			lentitiesDivision.save();
			entities.County lentitiesCounty = entities.County.createCounty();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : voter, post, sub_county, is_active, county_name, district
			lentitiesCounty.save();
			entities.Sub_county lentitiesSub_county = entities.Sub_county.createSub_county();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : voter, parish, is_active, subcounty_name, county
			lentitiesSub_county.save();
			entities.Parish lentitiesParish = entities.Parish.createParish();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : voter, is_active, parish_name, subcounty
			lentitiesParish.save();
			entities.Finger_print lentitiesFinger_print = entities.Finger_print.createFinger_print();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, voter
			lentitiesFinger_print.save();
			entities.Group_user lentitiesGroup_user = entities.Group_user.createGroup_user();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : is_active, group_detail, user_detail
			lentitiesGroup_user.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEVoteData createEVoteData = new CreateEVoteData();
			try {
				createEVoteData.createTestData();
			}
			finally {
				entities.EVotingPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
