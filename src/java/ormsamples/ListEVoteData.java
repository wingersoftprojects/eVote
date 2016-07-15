/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListEVoteData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Group_detail...");
		entities.Group_detail[] entitiesGroup_details = entities.Group_detail.listGroup_detailByQuery(null, null);
		int length = Math.min(entitiesGroup_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesGroup_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User_detail...");
		entities.User_detail[] entitiesUser_details = entities.User_detail.listUser_detailByQuery(null, null);
		length = Math.min(entitiesUser_details.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesUser_details[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_right...");
		entities.Group_right[] entitiesGroup_rights = entities.Group_right.listGroup_rightByQuery(null, null);
		length = Math.min(entitiesGroup_rights.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesGroup_rights[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Vote...");
		entities.Vote[] entitiesVotes = entities.Vote.listVoteByQuery(null, null);
		length = Math.min(entitiesVotes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesVotes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Candidate...");
		entities.Candidate[] entitiesCandidates = entities.Candidate.listCandidateByQuery(null, null);
		length = Math.min(entitiesCandidates.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesCandidates[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Post...");
		entities.Post[] entitiesPosts = entities.Post.listPostByQuery(null, null);
		length = Math.min(entitiesPosts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesPosts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Country...");
		entities.Country[] entitiesCountrys = entities.Country.listCountryByQuery(null, null);
		length = Math.min(entitiesCountrys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesCountrys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing District...");
		entities.District[] entitiesDistricts = entities.District.listDistrictByQuery(null, null);
		length = Math.min(entitiesDistricts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesDistricts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Polling_station...");
		entities.Polling_station[] entitiesPolling_stations = entities.Polling_station.listPolling_stationByQuery(null, null);
		length = Math.min(entitiesPolling_stations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesPolling_stations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Voter...");
		entities.Voter[] entitiesVoters = entities.Voter.listVoterByQuery(null, null);
		length = Math.min(entitiesVoters.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesVoters[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Division...");
		entities.Division[] entitiesDivisions = entities.Division.listDivisionByQuery(null, null);
		length = Math.min(entitiesDivisions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesDivisions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing County...");
		entities.County[] entitiesCountys = entities.County.listCountyByQuery(null, null);
		length = Math.min(entitiesCountys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesCountys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sub_county...");
		entities.Sub_county[] entitiesSub_countys = entities.Sub_county.listSub_countyByQuery(null, null);
		length = Math.min(entitiesSub_countys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesSub_countys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Parish...");
		entities.Parish[] entitiesParishs = entities.Parish.listParishByQuery(null, null);
		length = Math.min(entitiesParishs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesParishs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Finger_print...");
		entities.Finger_print[] entitiesFinger_prints = entities.Finger_print.listFinger_printByQuery(null, null);
		length = Math.min(entitiesFinger_prints.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesFinger_prints[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Group_user...");
		entities.Group_user[] entitiesGroup_users = entities.Group_user.listGroup_userByQuery(null, null);
		length = Math.min(entitiesGroup_users.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entitiesGroup_users[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Group_detail by Criteria...");
		entities.Group_detailCriteria lentitiesGroup_detailCriteria = new entities.Group_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesGroup_detailCriteria.group_detail_id.eq();
		lentitiesGroup_detailCriteria.setMaxResults(ROW_COUNT);
		entities.Group_detail[] entitiesGroup_details = lentitiesGroup_detailCriteria.listGroup_detail();
		int length =entitiesGroup_details== null ? 0 : Math.min(entitiesGroup_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesGroup_details[i]);
		}
		System.out.println(length + " Group_detail record(s) retrieved."); 
		
		System.out.println("Listing User_detail by Criteria...");
		entities.User_detailCriteria lentitiesUser_detailCriteria = new entities.User_detailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesUser_detailCriteria.user_detail_id.eq();
		lentitiesUser_detailCriteria.setMaxResults(ROW_COUNT);
		entities.User_detail[] entitiesUser_details = lentitiesUser_detailCriteria.listUser_detail();
		length =entitiesUser_details== null ? 0 : Math.min(entitiesUser_details.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesUser_details[i]);
		}
		System.out.println(length + " User_detail record(s) retrieved."); 
		
		System.out.println("Listing Group_right by Criteria...");
		entities.Group_rightCriteria lentitiesGroup_rightCriteria = new entities.Group_rightCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesGroup_rightCriteria.group_right_id.eq();
		lentitiesGroup_rightCriteria.setMaxResults(ROW_COUNT);
		entities.Group_right[] entitiesGroup_rights = lentitiesGroup_rightCriteria.listGroup_right();
		length =entitiesGroup_rights== null ? 0 : Math.min(entitiesGroup_rights.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesGroup_rights[i]);
		}
		System.out.println(length + " Group_right record(s) retrieved."); 
		
		System.out.println("Listing Vote by Criteria...");
		entities.VoteCriteria lentitiesVoteCriteria = new entities.VoteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesVoteCriteria.vote_id.eq();
		lentitiesVoteCriteria.setMaxResults(ROW_COUNT);
		entities.Vote[] entitiesVotes = lentitiesVoteCriteria.listVote();
		length =entitiesVotes== null ? 0 : Math.min(entitiesVotes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesVotes[i]);
		}
		System.out.println(length + " Vote record(s) retrieved."); 
		
		System.out.println("Listing Candidate by Criteria...");
		entities.CandidateCriteria lentitiesCandidateCriteria = new entities.CandidateCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesCandidateCriteria.candidate_id.eq();
		lentitiesCandidateCriteria.setMaxResults(ROW_COUNT);
		entities.Candidate[] entitiesCandidates = lentitiesCandidateCriteria.listCandidate();
		length =entitiesCandidates== null ? 0 : Math.min(entitiesCandidates.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesCandidates[i]);
		}
		System.out.println(length + " Candidate record(s) retrieved."); 
		
		System.out.println("Listing Post by Criteria...");
		entities.PostCriteria lentitiesPostCriteria = new entities.PostCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesPostCriteria.post_id.eq();
		lentitiesPostCriteria.setMaxResults(ROW_COUNT);
		entities.Post[] entitiesPosts = lentitiesPostCriteria.listPost();
		length =entitiesPosts== null ? 0 : Math.min(entitiesPosts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesPosts[i]);
		}
		System.out.println(length + " Post record(s) retrieved."); 
		
		System.out.println("Listing Country by Criteria...");
		entities.CountryCriteria lentitiesCountryCriteria = new entities.CountryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesCountryCriteria.country_id.eq();
		lentitiesCountryCriteria.setMaxResults(ROW_COUNT);
		entities.Country[] entitiesCountrys = lentitiesCountryCriteria.listCountry();
		length =entitiesCountrys== null ? 0 : Math.min(entitiesCountrys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesCountrys[i]);
		}
		System.out.println(length + " Country record(s) retrieved."); 
		
		System.out.println("Listing District by Criteria...");
		entities.DistrictCriteria lentitiesDistrictCriteria = new entities.DistrictCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesDistrictCriteria.district_id.eq();
		lentitiesDistrictCriteria.setMaxResults(ROW_COUNT);
		entities.District[] entitiesDistricts = lentitiesDistrictCriteria.listDistrict();
		length =entitiesDistricts== null ? 0 : Math.min(entitiesDistricts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesDistricts[i]);
		}
		System.out.println(length + " District record(s) retrieved."); 
		
		System.out.println("Listing Polling_station by Criteria...");
		entities.Polling_stationCriteria lentitiesPolling_stationCriteria = new entities.Polling_stationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesPolling_stationCriteria.polling_station_id.eq();
		lentitiesPolling_stationCriteria.setMaxResults(ROW_COUNT);
		entities.Polling_station[] entitiesPolling_stations = lentitiesPolling_stationCriteria.listPolling_station();
		length =entitiesPolling_stations== null ? 0 : Math.min(entitiesPolling_stations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesPolling_stations[i]);
		}
		System.out.println(length + " Polling_station record(s) retrieved."); 
		
		System.out.println("Listing Voter by Criteria...");
		entities.VoterCriteria lentitiesVoterCriteria = new entities.VoterCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesVoterCriteria.voter_id.eq();
		lentitiesVoterCriteria.setMaxResults(ROW_COUNT);
		entities.Voter[] entitiesVoters = lentitiesVoterCriteria.listVoter();
		length =entitiesVoters== null ? 0 : Math.min(entitiesVoters.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesVoters[i]);
		}
		System.out.println(length + " Voter record(s) retrieved."); 
		
		System.out.println("Listing Division by Criteria...");
		entities.DivisionCriteria lentitiesDivisionCriteria = new entities.DivisionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesDivisionCriteria.division_id.eq();
		lentitiesDivisionCriteria.setMaxResults(ROW_COUNT);
		entities.Division[] entitiesDivisions = lentitiesDivisionCriteria.listDivision();
		length =entitiesDivisions== null ? 0 : Math.min(entitiesDivisions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesDivisions[i]);
		}
		System.out.println(length + " Division record(s) retrieved."); 
		
		System.out.println("Listing County by Criteria...");
		entities.CountyCriteria lentitiesCountyCriteria = new entities.CountyCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesCountyCriteria.county_id.eq();
		lentitiesCountyCriteria.setMaxResults(ROW_COUNT);
		entities.County[] entitiesCountys = lentitiesCountyCriteria.listCounty();
		length =entitiesCountys== null ? 0 : Math.min(entitiesCountys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesCountys[i]);
		}
		System.out.println(length + " County record(s) retrieved."); 
		
		System.out.println("Listing Sub_county by Criteria...");
		entities.Sub_countyCriteria lentitiesSub_countyCriteria = new entities.Sub_countyCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesSub_countyCriteria.sub_county_id.eq();
		lentitiesSub_countyCriteria.setMaxResults(ROW_COUNT);
		entities.Sub_county[] entitiesSub_countys = lentitiesSub_countyCriteria.listSub_county();
		length =entitiesSub_countys== null ? 0 : Math.min(entitiesSub_countys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesSub_countys[i]);
		}
		System.out.println(length + " Sub_county record(s) retrieved."); 
		
		System.out.println("Listing Parish by Criteria...");
		entities.ParishCriteria lentitiesParishCriteria = new entities.ParishCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesParishCriteria.parish_id.eq();
		lentitiesParishCriteria.setMaxResults(ROW_COUNT);
		entities.Parish[] entitiesParishs = lentitiesParishCriteria.listParish();
		length =entitiesParishs== null ? 0 : Math.min(entitiesParishs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesParishs[i]);
		}
		System.out.println(length + " Parish record(s) retrieved."); 
		
		System.out.println("Listing Finger_print by Criteria...");
		entities.Finger_printCriteria lentitiesFinger_printCriteria = new entities.Finger_printCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesFinger_printCriteria.finger_print_id.eq();
		lentitiesFinger_printCriteria.setMaxResults(ROW_COUNT);
		entities.Finger_print[] entitiesFinger_prints = lentitiesFinger_printCriteria.listFinger_print();
		length =entitiesFinger_prints== null ? 0 : Math.min(entitiesFinger_prints.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesFinger_prints[i]);
		}
		System.out.println(length + " Finger_print record(s) retrieved."); 
		
		System.out.println("Listing Group_user by Criteria...");
		entities.Group_userCriteria lentitiesGroup_userCriteria = new entities.Group_userCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lentitiesGroup_userCriteria.group_user_id.eq();
		lentitiesGroup_userCriteria.setMaxResults(ROW_COUNT);
		entities.Group_user[] entitiesGroup_users = lentitiesGroup_userCriteria.listGroup_user();
		length =entitiesGroup_users== null ? 0 : Math.min(entitiesGroup_users.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entitiesGroup_users[i]);
		}
		System.out.println(length + " Group_user record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEVoteData listEVoteData = new ListEVoteData();
			try {
				listEVoteData.listTestData();
				//listEVoteData.listByCriteria();
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
