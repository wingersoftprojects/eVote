/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateEVoteData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = entities.EVotingPersistentManager.instance().getSession().beginTransaction();
		try {
			entities.Group_detail lentitiesGroup_detail = entities.Group_detail.loadGroup_detailByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesGroup_detail.save();
			entities.User_detail lentitiesUser_detail = entities.User_detail.loadUser_detailByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesUser_detail.save();
			entities.Group_right lentitiesGroup_right = entities.Group_right.loadGroup_rightByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesGroup_right.save();
			entities.Vote lentitiesVote = entities.Vote.loadVoteByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesVote.save();
			entities.Candidate lentitiesCandidate = entities.Candidate.loadCandidateByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesCandidate.save();
			entities.Post lentitiesPost = entities.Post.loadPostByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesPost.save();
			entities.Country lentitiesCountry = entities.Country.loadCountryByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesCountry.save();
			entities.District lentitiesDistrict = entities.District.loadDistrictByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesDistrict.save();
			entities.Polling_station lentitiesPolling_station = entities.Polling_station.loadPolling_stationByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesPolling_station.save();
			entities.Voter lentitiesVoter = entities.Voter.loadVoterByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesVoter.save();
			entities.Division lentitiesDivision = entities.Division.loadDivisionByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesDivision.save();
			entities.County lentitiesCounty = entities.County.loadCountyByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesCounty.save();
			entities.Sub_county lentitiesSub_county = entities.Sub_county.loadSub_countyByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesSub_county.save();
			entities.Parish lentitiesParish = entities.Parish.loadParishByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesParish.save();
			entities.Finger_print lentitiesFinger_print = entities.Finger_print.loadFinger_printByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesFinger_print.save();
			entities.Group_user lentitiesGroup_user = entities.Group_user.loadGroup_userByQuery(null, null);
			// Update the properties of the persistent object
			lentitiesGroup_user.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Group_detail by Group_detailCriteria");
		entities.Group_detailCriteria lentitiesGroup_detailCriteria = new entities.Group_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesGroup_detailCriteria.group_detail_id.eq();
		System.out.println(lentitiesGroup_detailCriteria.uniqueGroup_detail());
		
		System.out.println("Retrieving User_detail by User_detailCriteria");
		entities.User_detailCriteria lentitiesUser_detailCriteria = new entities.User_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesUser_detailCriteria.user_detail_id.eq();
		System.out.println(lentitiesUser_detailCriteria.uniqueUser_detail());
		
		System.out.println("Retrieving Group_right by Group_rightCriteria");
		entities.Group_rightCriteria lentitiesGroup_rightCriteria = new entities.Group_rightCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesGroup_rightCriteria.group_right_id.eq();
		System.out.println(lentitiesGroup_rightCriteria.uniqueGroup_right());
		
		System.out.println("Retrieving Vote by VoteCriteria");
		entities.VoteCriteria lentitiesVoteCriteria = new entities.VoteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesVoteCriteria.vote_id.eq();
		System.out.println(lentitiesVoteCriteria.uniqueVote());
		
		System.out.println("Retrieving Candidate by CandidateCriteria");
		entities.CandidateCriteria lentitiesCandidateCriteria = new entities.CandidateCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesCandidateCriteria.candidate_id.eq();
		System.out.println(lentitiesCandidateCriteria.uniqueCandidate());
		
		System.out.println("Retrieving Post by PostCriteria");
		entities.PostCriteria lentitiesPostCriteria = new entities.PostCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesPostCriteria.post_id.eq();
		System.out.println(lentitiesPostCriteria.uniquePost());
		
		System.out.println("Retrieving Country by CountryCriteria");
		entities.CountryCriteria lentitiesCountryCriteria = new entities.CountryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesCountryCriteria.country_id.eq();
		System.out.println(lentitiesCountryCriteria.uniqueCountry());
		
		System.out.println("Retrieving District by DistrictCriteria");
		entities.DistrictCriteria lentitiesDistrictCriteria = new entities.DistrictCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesDistrictCriteria.district_id.eq();
		System.out.println(lentitiesDistrictCriteria.uniqueDistrict());
		
		System.out.println("Retrieving Polling_station by Polling_stationCriteria");
		entities.Polling_stationCriteria lentitiesPolling_stationCriteria = new entities.Polling_stationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesPolling_stationCriteria.polling_station_id.eq();
		System.out.println(lentitiesPolling_stationCriteria.uniquePolling_station());
		
		System.out.println("Retrieving Voter by VoterCriteria");
		entities.VoterCriteria lentitiesVoterCriteria = new entities.VoterCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesVoterCriteria.voter_id.eq();
		System.out.println(lentitiesVoterCriteria.uniqueVoter());
		
		System.out.println("Retrieving Division by DivisionCriteria");
		entities.DivisionCriteria lentitiesDivisionCriteria = new entities.DivisionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesDivisionCriteria.division_id.eq();
		System.out.println(lentitiesDivisionCriteria.uniqueDivision());
		
		System.out.println("Retrieving County by CountyCriteria");
		entities.CountyCriteria lentitiesCountyCriteria = new entities.CountyCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesCountyCriteria.county_id.eq();
		System.out.println(lentitiesCountyCriteria.uniqueCounty());
		
		System.out.println("Retrieving Sub_county by Sub_countyCriteria");
		entities.Sub_countyCriteria lentitiesSub_countyCriteria = new entities.Sub_countyCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesSub_countyCriteria.sub_county_id.eq();
		System.out.println(lentitiesSub_countyCriteria.uniqueSub_county());
		
		System.out.println("Retrieving Parish by ParishCriteria");
		entities.ParishCriteria lentitiesParishCriteria = new entities.ParishCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesParishCriteria.parish_id.eq();
		System.out.println(lentitiesParishCriteria.uniqueParish());
		
		System.out.println("Retrieving Finger_print by Finger_printCriteria");
		entities.Finger_printCriteria lentitiesFinger_printCriteria = new entities.Finger_printCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesFinger_printCriteria.finger_print_id.eq();
		System.out.println(lentitiesFinger_printCriteria.uniqueFinger_print());
		
		System.out.println("Retrieving Group_user by Group_userCriteria");
		entities.Group_userCriteria lentitiesGroup_userCriteria = new entities.Group_userCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lentitiesGroup_userCriteria.group_user_id.eq();
		System.out.println(lentitiesGroup_userCriteria.uniqueGroup_user());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEVoteData retrieveAndUpdateEVoteData = new RetrieveAndUpdateEVoteData();
			try {
				retrieveAndUpdateEVoteData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEVoteData.retrieveByCriteria();
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
