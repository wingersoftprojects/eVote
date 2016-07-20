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

public class VillageDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public VillageDetachedCriteria() {
		super(entities.Village.class, entities.VillageCriteria.class);
		village_id = new IntegerExpression("village_id", this.getDetachedCriteria());
		village_name = new StringExpression("village_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		parishId = new IntegerExpression("parish.parish_id", this.getDetachedCriteria());
		parish = new AssociationExpression("parish", this.getDetachedCriteria());
		polling_station = new CollectionExpression("polling_station", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
	}
	
	public VillageDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.VillageCriteria.class);
		village_id = new IntegerExpression("village_id", this.getDetachedCriteria());
		village_name = new StringExpression("village_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		parishId = new IntegerExpression("parish.parish_id", this.getDetachedCriteria());
		parish = new AssociationExpression("parish", this.getDetachedCriteria());
		polling_station = new CollectionExpression("polling_station", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
	}
	
	public ParishDetachedCriteria createParishCriteria() {
		return new ParishDetachedCriteria(createCriteria("parish"));
	}
	
	public Polling_stationDetachedCriteria createPolling_stationCriteria() {
		return new Polling_stationDetachedCriteria(createCriteria("polling_station"));
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public Village uniqueVillage(PersistentSession session) {
		return (Village) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Village[] listVillage(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Village[]) list.toArray(new Village[list.size()]);
	}
}

