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

public class Finger_printCriteria extends AbstractORMCriteria {
	public final IntegerExpression finger_print_id;
	public final StringExpression fingerprint_name;
	public final BlobExpression fingerprint_blob;
	public final IntegerExpression voterId;
	public final AssociationExpression voter;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	
	public Finger_printCriteria(Criteria criteria) {
		super(criteria);
		finger_print_id = new IntegerExpression("finger_print_id", this);
		fingerprint_name = new StringExpression("fingerprint_name", this);
		fingerprint_blob = new BlobExpression("fingerprint_blob", this);
		voterId = new IntegerExpression("voter.voter_id", this);
		voter = new AssociationExpression("voter", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
	}
	
	public Finger_printCriteria(PersistentSession session) {
		this(session.createCriteria(Finger_print.class));
	}
	
	public Finger_printCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public Finger_print uniqueFinger_print() {
		return (Finger_print) super.uniqueResult();
	}
	
	public Finger_print[] listFinger_print() {
		java.util.List list = super.list();
		return (Finger_print[]) list.toArray(new Finger_print[list.size()]);
	}
}

