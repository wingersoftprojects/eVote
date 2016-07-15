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

public class Polling_stationDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Polling_stationDetachedCriteria() {
		super(entities.Polling_station.class, entities.Polling_stationCriteria.class);
		polling_station_id = new IntegerExpression("polling_station_id", this.getDetachedCriteria());
		poll_station_name = new StringExpression("poll_station_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
		candidate = new CollectionExpression("candidate", this.getDetachedCriteria());
	}
	
	public Polling_stationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.Polling_stationCriteria.class);
		polling_station_id = new IntegerExpression("polling_station_id", this.getDetachedCriteria());
		poll_station_name = new StringExpression("poll_station_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
		candidate = new CollectionExpression("candidate", this.getDetachedCriteria());
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public CandidateDetachedCriteria createCandidateCriteria() {
		return new CandidateDetachedCriteria(createCriteria("candidate"));
	}
	
	public Polling_station uniquePolling_station(PersistentSession session) {
		return (Polling_station) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Polling_station[] listPolling_station(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Polling_station[]) list.toArray(new Polling_station[list.size()]);
	}
}

