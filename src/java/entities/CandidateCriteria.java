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

public class CandidateCriteria extends AbstractORMCriteria {
	public final IntegerExpression candidate_id;
	public final IntegerExpression voterId;
	public final AssociationExpression voter;
	public final IntegerExpression postId;
	public final AssociationExpression post;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression vote;
	
	public CandidateCriteria(Criteria criteria) {
		super(criteria);
		candidate_id = new IntegerExpression("candidate_id", this);
		voterId = new IntegerExpression("voter.voter_id", this);
		voter = new AssociationExpression("voter", this);
		postId = new IntegerExpression("post.post_id", this);
		post = new AssociationExpression("post", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		vote = new CollectionExpression("vote", this);
	}
	
	public CandidateCriteria(PersistentSession session) {
		this(session.createCriteria(Candidate.class));
	}
	
	public CandidateCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public PostCriteria createPostCriteria() {
		return new PostCriteria(createCriteria("post"));
	}
	
	public VoteCriteria createVoteCriteria() {
		return new VoteCriteria(createCriteria("vote"));
	}
	
	public Candidate uniqueCandidate() {
		return (Candidate) super.uniqueResult();
	}
	
	public Candidate[] listCandidate() {
		java.util.List list = super.list();
		return (Candidate[]) list.toArray(new Candidate[list.size()]);
	}
}

