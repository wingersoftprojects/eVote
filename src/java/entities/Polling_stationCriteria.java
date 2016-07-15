/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package entities;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Polling_stationCriteria extends AbstractORMCriteria {
	public final IntegerExpression polling_station_id;
	public final StringExpression poll_station_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression voter;
	public final CollectionExpression candidate;
	
	public Polling_stationCriteria(Criteria criteria) {
		super(criteria);
		polling_station_id = new IntegerExpression("polling_station_id", this);
		poll_station_name = new StringExpression("poll_station_name", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		voter = new CollectionExpression("voter", this);
		candidate = new CollectionExpression("candidate", this);
	}
	
	public Polling_stationCriteria(PersistentSession session) {
		this(session.createCriteria(Polling_station.class));
	}
	
	public Polling_stationCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public CandidateCriteria createCandidateCriteria() {
		return new CandidateCriteria(createCriteria("candidate"));
	}
	
	public Polling_station uniquePolling_station() {
		return (Polling_station) super.uniqueResult();
	}
	
	public Polling_station[] listPolling_station() {
		java.util.List list = super.list();
		return (Polling_station[]) list.toArray(new Polling_station[list.size()]);
	}
}
