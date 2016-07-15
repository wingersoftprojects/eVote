/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteEVoteData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = entities.EVotingPersistentManager.instance().getSession().beginTransaction();
		try {
			entities.Group_detail lentitiesGroup_detail = entities.Group_detail.loadGroup_detailByQuery(null, null);
			lentitiesGroup_detail.delete();
			entities.User_detail lentitiesUser_detail = entities.User_detail.loadUser_detailByQuery(null, null);
			lentitiesUser_detail.delete();
			entities.Group_right lentitiesGroup_right = entities.Group_right.loadGroup_rightByQuery(null, null);
			lentitiesGroup_right.delete();
			entities.Vote lentitiesVote = entities.Vote.loadVoteByQuery(null, null);
			lentitiesVote.delete();
			entities.Candidate lentitiesCandidate = entities.Candidate.loadCandidateByQuery(null, null);
			lentitiesCandidate.delete();
			entities.Post lentitiesPost = entities.Post.loadPostByQuery(null, null);
			lentitiesPost.delete();
			entities.Country lentitiesCountry = entities.Country.loadCountryByQuery(null, null);
			lentitiesCountry.delete();
			entities.District lentitiesDistrict = entities.District.loadDistrictByQuery(null, null);
			lentitiesDistrict.delete();
			entities.Polling_station lentitiesPolling_station = entities.Polling_station.loadPolling_stationByQuery(null, null);
			lentitiesPolling_station.delete();
			entities.Voter lentitiesVoter = entities.Voter.loadVoterByQuery(null, null);
			lentitiesVoter.delete();
			entities.Division lentitiesDivision = entities.Division.loadDivisionByQuery(null, null);
			lentitiesDivision.delete();
			entities.County lentitiesCounty = entities.County.loadCountyByQuery(null, null);
			lentitiesCounty.delete();
			entities.Sub_county lentitiesSub_county = entities.Sub_county.loadSub_countyByQuery(null, null);
			lentitiesSub_county.delete();
			entities.Parish lentitiesParish = entities.Parish.loadParishByQuery(null, null);
			lentitiesParish.delete();
			entities.Finger_print lentitiesFinger_print = entities.Finger_print.loadFinger_printByQuery(null, null);
			lentitiesFinger_print.delete();
			entities.Group_user lentitiesGroup_user = entities.Group_user.loadGroup_userByQuery(null, null);
			lentitiesGroup_user.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEVoteData deleteEVoteData = new DeleteEVoteData();
			try {
				deleteEVoteData.deleteTestData();
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
