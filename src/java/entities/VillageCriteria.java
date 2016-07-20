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

public class VillageCriteria extends AbstractORMCriteria {
	public final IntegerExpression village_id;
	public final StringExpression village_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final IntegerExpression parishId;
	public final AssociationExpression parish;
	public final CollectionExpression polling_station;
	public final CollectionExpression voter;
	
	public VillageCriteria(Criteria criteria) {
		super(criteria);
		village_id = new IntegerExpression("village_id", this);
		village_name = new StringExpression("village_name", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		parishId = new IntegerExpression("parish.parish_id", this);
		parish = new AssociationExpression("parish", this);
		polling_station = new CollectionExpression("polling_station", this);
		voter = new CollectionExpression("voter", this);
	}
	
	public VillageCriteria(PersistentSession session) {
		this(session.createCriteria(Village.class));
	}
	
	public VillageCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public ParishCriteria createParishCriteria() {
		return new ParishCriteria(createCriteria("parish"));
	}
	
	public Polling_stationCriteria createPolling_stationCriteria() {
		return new Polling_stationCriteria(createCriteria("polling_station"));
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public Village uniqueVillage() {
		return (Village) super.uniqueResult();
	}
	
	public Village[] listVillage() {
		java.util.List list = super.list();
		return (Village[]) list.toArray(new Village[list.size()]);
	}
}

