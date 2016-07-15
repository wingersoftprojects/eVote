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

public class VoteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression vote_id;
	public final StringExpression vote_name;
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
	
	public VoteDetachedCriteria() {
		super(entities.Vote.class, entities.VoteCriteria.class);
		vote_id = new IntegerExpression("vote_id", this.getDetachedCriteria());
		vote_name = new StringExpression("vote_name", this.getDetachedCriteria());
		postId = new IntegerExpression("post.post_id", this.getDetachedCriteria());
		post = new AssociationExpression("post", this.getDetachedCriteria());
		candidateId = new IntegerExpression("candidate.candidate_id", this.getDetachedCriteria());
		candidate = new AssociationExpression("candidate", this.getDetachedCriteria());
		vote_date_time = new DateExpression("vote_date_time", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public VoteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.VoteCriteria.class);
		vote_id = new IntegerExpression("vote_id", this.getDetachedCriteria());
		vote_name = new StringExpression("vote_name", this.getDetachedCriteria());
		postId = new IntegerExpression("post.post_id", this.getDetachedCriteria());
		post = new AssociationExpression("post", this.getDetachedCriteria());
		candidateId = new IntegerExpression("candidate.candidate_id", this.getDetachedCriteria());
		candidate = new AssociationExpression("candidate", this.getDetachedCriteria());
		vote_date_time = new DateExpression("vote_date_time", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public PostDetachedCriteria createPostCriteria() {
		return new PostDetachedCriteria(createCriteria("post"));
	}
	
	public CandidateDetachedCriteria createCandidateCriteria() {
		return new CandidateDetachedCriteria(createCriteria("candidate"));
	}
	
	public Vote uniqueVote(PersistentSession session) {
		return (Vote) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Vote[] listVote(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Vote[]) list.toArray(new Vote[list.size()]);
	}
}

