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

public class CountyCriteria extends AbstractORMCriteria {
	public final IntegerExpression county_id;
	public final IntegerExpression districtId;
	public final AssociationExpression district;
	public final StringExpression county_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression sub_county;
	public final CollectionExpression post;
	public final CollectionExpression voter;
	
	public CountyCriteria(Criteria criteria) {
		super(criteria);
		county_id = new IntegerExpression("county_id", this);
		districtId = new IntegerExpression("district.district_id", this);
		district = new AssociationExpression("district", this);
		county_name = new StringExpression("county_name", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		sub_county = new CollectionExpression("sub_county", this);
		post = new CollectionExpression("post", this);
		voter = new CollectionExpression("voter", this);
	}
	
	public CountyCriteria(PersistentSession session) {
		this(session.createCriteria(County.class));
	}
	
	public CountyCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public DistrictCriteria createDistrictCriteria() {
		return new DistrictCriteria(createCriteria("district"));
	}
	
	public Sub_countyCriteria createSub_countyCriteria() {
		return new Sub_countyCriteria(createCriteria("sub_county"));
	}
	
	public PostCriteria createPostCriteria() {
		return new PostCriteria(createCriteria("post"));
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public County uniqueCounty() {
		return (County) super.uniqueResult();
	}
	
	public County[] listCounty() {
		java.util.List list = super.list();
		return (County[]) list.toArray(new County[list.size()]);
	}
}

