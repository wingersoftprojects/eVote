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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class VoteCriteria extends AbstractORMCriteria {
	public final IntegerExpression vote_id;
	public final IntegerExpression postId;
	public final AssociationExpression post;
	public final IntegerExpression candidateId;
	public final AssociationExpression candidate;
	public final DateExpression vote_date_time;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final IntegerExpression voterId;
	public final AssociationExpression voter;
	
	public VoteCriteria(Criteria criteria) {
		super(criteria);
		vote_id = new IntegerExpression("vote_id", this);
		postId = new IntegerExpression("post.post_id", this);
		post = new AssociationExpression("post", this);
		candidateId = new IntegerExpression("candidate.candidate_id", this);
		candidate = new AssociationExpression("candidate", this);
		vote_date_time = new DateExpression("vote_date_time", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		voterId = new IntegerExpression("voter.voter_id", this);
		voter = new AssociationExpression("voter", this);
	}
	
	public VoteCriteria(PersistentSession session) {
		this(session.createCriteria(Vote.class));
	}
	
	public VoteCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public PostCriteria createPostCriteria() {
		return new PostCriteria(createCriteria("post"));
	}
	
	public CandidateCriteria createCandidateCriteria() {
		return new CandidateCriteria(createCriteria("candidate"));
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public Vote uniqueVote() {
		return (Vote) super.uniqueResult();
	}
	
	public Vote[] listVote() {
		java.util.List list = super.list();
		return (Vote[]) list.toArray(new Vote[list.size()]);
	}
}

