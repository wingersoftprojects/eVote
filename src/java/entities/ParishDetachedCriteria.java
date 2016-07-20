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

public class ParishDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression parish_id;
	public final IntegerExpression sub_countyId;
	public final AssociationExpression sub_county;
	public final StringExpression parish_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression voter;
	public final CollectionExpression village;
	
	public ParishDetachedCriteria() {
		super(entities.Parish.class, entities.ParishCriteria.class);
		parish_id = new IntegerExpression("parish_id", this.getDetachedCriteria());
		sub_countyId = new IntegerExpression("sub_county.sub_county_id", this.getDetachedCriteria());
		sub_county = new AssociationExpression("sub_county", this.getDetachedCriteria());
		parish_name = new StringExpression("parish_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
		village = new CollectionExpression("village", this.getDetachedCriteria());
	}
	
	public ParishDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.ParishCriteria.class);
		parish_id = new IntegerExpression("parish_id", this.getDetachedCriteria());
		sub_countyId = new IntegerExpression("sub_county.sub_county_id", this.getDetachedCriteria());
		sub_county = new AssociationExpression("sub_county", this.getDetachedCriteria());
		parish_name = new StringExpression("parish_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
		village = new CollectionExpression("village", this.getDetachedCriteria());
	}
	
	public Sub_countyDetachedCriteria createSub_countyCriteria() {
		return new Sub_countyDetachedCriteria(createCriteria("sub_county"));
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public VillageDetachedCriteria createVillageCriteria() {
		return new VillageDetachedCriteria(createCriteria("village"));
	}
	
	public Parish uniqueParish(PersistentSession session) {
		return (Parish) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Parish[] listParish(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Parish[]) list.toArray(new Parish[list.size()]);
	}
}

