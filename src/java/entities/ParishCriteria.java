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

public class ParishCriteria extends AbstractORMCriteria {
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
	
	public ParishCriteria(Criteria criteria) {
		super(criteria);
		parish_id = new IntegerExpression("parish_id", this);
		sub_countyId = new IntegerExpression("sub_county.sub_county_id", this);
		sub_county = new AssociationExpression("sub_county", this);
		parish_name = new StringExpression("parish_name", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		voter = new CollectionExpression("voter", this);
		village = new CollectionExpression("village", this);
	}
	
	public ParishCriteria(PersistentSession session) {
		this(session.createCriteria(Parish.class));
	}
	
	public ParishCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public Sub_countyCriteria createSub_countyCriteria() {
		return new Sub_countyCriteria(createCriteria("sub_county"));
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public VillageCriteria createVillageCriteria() {
		return new VillageCriteria(createCriteria("village"));
	}
	
	public Parish uniqueParish() {
		return (Parish) super.uniqueResult();
	}
	
	public Parish[] listParish() {
		java.util.List list = super.list();
		return (Parish[]) list.toArray(new Parish[list.size()]);
	}
}

