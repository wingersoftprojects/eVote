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

public class Group_userCriteria extends AbstractORMCriteria {
	public final IntegerExpression group_user_id;
	public final IntegerExpression user_detailId;
	public final AssociationExpression user_detail;
	public final IntegerExpression groupId;
	public final AssociationExpression group;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	
	public Group_userCriteria(Criteria criteria) {
		super(criteria);
		group_user_id = new IntegerExpression("group_user_id", this);
		user_detailId = new IntegerExpression("user_detail.user_detail_id", this);
		user_detail = new AssociationExpression("user_detail", this);
		groupId = new IntegerExpression("group.group_detail_id", this);
		group = new AssociationExpression("group", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
	}
	
	public Group_userCriteria(PersistentSession session) {
		this(session.createCriteria(Group_user.class));
	}
	
	public Group_userCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public User_detailCriteria createUser_detailCriteria() {
		return new User_detailCriteria(createCriteria("user_detail"));
	}
	
	public Group_detailCriteria createGroupCriteria() {
		return new Group_detailCriteria(createCriteria("group"));
	}
	
	public Group_user uniqueGroup_user() {
		return (Group_user) super.uniqueResult();
	}
	
	public Group_user[] listGroup_user() {
		java.util.List list = super.list();
		return (Group_user[]) list.toArray(new Group_user[list.size()]);
	}
}

