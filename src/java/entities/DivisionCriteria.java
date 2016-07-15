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

public class DivisionCriteria extends AbstractORMCriteria {
	public final IntegerExpression division_id;
	public final StringExpression division_name;
	public final IntegerExpression districtId;
	public final AssociationExpression district;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression post;
	
	public DivisionCriteria(Criteria criteria) {
		super(criteria);
		division_id = new IntegerExpression("division_id", this);
		division_name = new StringExpression("division_name", this);
		districtId = new IntegerExpression("district.district_id", this);
		district = new AssociationExpression("district", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		post = new CollectionExpression("post", this);
	}
	
	public DivisionCriteria(PersistentSession session) {
		this(session.createCriteria(Division.class));
	}
	
	public DivisionCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public DistrictCriteria createDistrictCriteria() {
		return new DistrictCriteria(createCriteria("district"));
	}
	
	public PostCriteria createPostCriteria() {
		return new PostCriteria(createCriteria("post"));
	}
	
	public Division uniqueDivision() {
		return (Division) super.uniqueResult();
	}
	
	public Division[] listDivision() {
		java.util.List list = super.list();
		return (Division[]) list.toArray(new Division[list.size()]);
	}
}

