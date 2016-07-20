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

public class Sub_countyDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression sub_county_id;
	public final IntegerExpression countyId;
	public final AssociationExpression county;
	public final StringExpression sub_county_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression voter;
	public final CollectionExpression parish;
	
	public Sub_countyDetachedCriteria() {
		super(entities.Sub_county.class, entities.Sub_countyCriteria.class);
		sub_county_id = new IntegerExpression("sub_county_id", this.getDetachedCriteria());
		countyId = new IntegerExpression("county.county_id", this.getDetachedCriteria());
		county = new AssociationExpression("county", this.getDetachedCriteria());
		sub_county_name = new StringExpression("sub_county_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
		parish = new CollectionExpression("parish", this.getDetachedCriteria());
	}
	
	public Sub_countyDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.Sub_countyCriteria.class);
		sub_county_id = new IntegerExpression("sub_county_id", this.getDetachedCriteria());
		countyId = new IntegerExpression("county.county_id", this.getDetachedCriteria());
		county = new AssociationExpression("county", this.getDetachedCriteria());
		sub_county_name = new StringExpression("sub_county_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
		parish = new CollectionExpression("parish", this.getDetachedCriteria());
	}
	
	public CountyDetachedCriteria createCountyCriteria() {
		return new CountyDetachedCriteria(createCriteria("county"));
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public ParishDetachedCriteria createParishCriteria() {
		return new ParishDetachedCriteria(createCriteria("parish"));
	}
	
	public Sub_county uniqueSub_county(PersistentSession session) {
		return (Sub_county) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sub_county[] listSub_county(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sub_county[]) list.toArray(new Sub_county[list.size()]);
	}
}

