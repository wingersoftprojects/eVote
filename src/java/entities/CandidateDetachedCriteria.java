/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: btwesigye
 * License Type: Purchased
 */
package entities;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CandidateDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression candidate_id;
	public final StringExpression candidate_name;
	public final IntegerExpression voterId;
	public final AssociationExpression voter;
	public final IntegerExpression postId;
	public final AssociationExpression post;
	public final IntegerExpression polling_stationId;
	public final AssociationExpression polling_station;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression vote;
	
	public CandidateDetachedCriteria() {
		super(entities.Candidate.class, entities.CandidateCriteria.class);
		candidate_id = new IntegerExpression("candidate_id", this.getDetachedCriteria());
		candidate_name = new StringExpression("candidate_name", this.getDetachedCriteria());
		voterId = new IntegerExpression("voter.voter_id", this.getDetachedCriteria());
		voter = new AssociationExpression("voter", this.getDetachedCriteria());
		postId = new IntegerExpression("post.post_id", this.getDetachedCriteria());
		post = new AssociationExpression("post", this.getDetachedCriteria());
		polling_stationId = new IntegerExpression("polling_station.polling_station_id", this.getDetachedCriteria());
		polling_station = new AssociationExpression("polling_station", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		vote = new CollectionExpression("vote", this.getDetachedCriteria());
	}
	
	public CandidateDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.CandidateCriteria.class);
		candidate_id = new IntegerExpression("candidate_id", this.getDetachedCriteria());
		candidate_name = new StringExpression("candidate_name", this.getDetachedCriteria());
		voterId = new IntegerExpression("voter.voter_id", this.getDetachedCriteria());
		voter = new AssociationExpression("voter", this.getDetachedCriteria());
		postId = new IntegerExpression("post.post_id", this.getDetachedCriteria());
		post = new AssociationExpression("post", this.getDetachedCriteria());
		polling_stationId = new IntegerExpression("polling_station.polling_station_id", this.getDetachedCriteria());
		polling_station = new AssociationExpression("polling_station", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		vote = new CollectionExpression("vote", this.getDetachedCriteria());
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public PostDetachedCriteria createPostCriteria() {
		return new PostDetachedCriteria(createCriteria("post"));
	}
	
	public Polling_stationDetachedCriteria createPolling_stationCriteria() {
		return new Polling_stationDetachedCriteria(createCriteria("polling_station"));
	}
	
	public VoteDetachedCriteria createVoteCriteria() {
		return new VoteDetachedCriteria(createCriteria("vote"));
	}
	
	public Candidate uniqueCandidate(PersistentSession session) {
		return (Candidate) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Candidate[] listCandidate(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Candidate[]) list.toArray(new Candidate[list.size()]);
	}
}

