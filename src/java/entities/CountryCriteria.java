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

public class CountryCriteria extends AbstractORMCriteria {
	public final IntegerExpression country_id;
	public final StringExpression country_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression district;
	public final CollectionExpression post;
	
	public CountryCriteria(Criteria criteria) {
		super(criteria);
		country_id = new IntegerExpression("country_id", this);
		country_name = new StringExpression("country_name", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		district = new CollectionExpression("district", this);
		post = new CollectionExpression("post", this);
	}
	
	public CountryCriteria(PersistentSession session) {
		this(session.createCriteria(Country.class));
	}
	
	public CountryCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public DistrictCriteria createDistrictCriteria() {
		return new DistrictCriteria(createCriteria("district"));
	}
	
	public PostCriteria createPostCriteria() {
		return new PostCriteria(createCriteria("post"));
	}
	
	public Country uniqueCountry() {
		return (Country) super.uniqueResult();
	}
	
	public Country[] listCountry() {
		java.util.List list = super.list();
		return (Country[]) list.toArray(new Country[list.size()]);
	}
}

