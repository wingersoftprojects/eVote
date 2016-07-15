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

public class Sub_countyCriteria extends AbstractORMCriteria {
	public final IntegerExpression sub_county_id;
	public final IntegerExpression countyId;
	public final AssociationExpression county;
	public final StringExpression subcounty_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression parish;
	public final CollectionExpression voter;
	
	public Sub_countyCriteria(Criteria criteria) {
		super(criteria);
		sub_county_id = new IntegerExpression("sub_county_id", this);
		countyId = new IntegerExpression("county.county_id", this);
		county = new AssociationExpression("county", this);
		subcounty_name = new StringExpression("subcounty_name", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		parish = new CollectionExpression("parish", this);
		voter = new CollectionExpression("voter", this);
	}
	
	public Sub_countyCriteria(PersistentSession session) {
		this(session.createCriteria(Sub_county.class));
	}
	
	public Sub_countyCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public CountyCriteria createCountyCriteria() {
		return new CountyCriteria(createCriteria("county"));
	}
	
	public ParishCriteria createParishCriteria() {
		return new ParishCriteria(createCriteria("parish"));
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public Sub_county uniqueSub_county() {
		return (Sub_county) super.uniqueResult();
	}
	
	public Sub_county[] listSub_county() {
		java.util.List list = super.list();
		return (Sub_county[]) list.toArray(new Sub_county[list.size()]);
	}
}

