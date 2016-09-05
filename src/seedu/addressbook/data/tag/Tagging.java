package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	
	private Name name;
	private Tag tag;
	private boolean isAddedOrDeleted; //true if the tag is added, false if the tag is deleted
	
	public Tagging(Name name, Tag tag, boolean isAddedOrDeleted) {
		this.name = name;
		this.tag = tag;
		this.isAddedOrDeleted = isAddedOrDeleted;
	}
	
	public String toString() {
		String s = "";
		if (isAddedOrDeleted) {
			s += "+ ";
		} else {
			s += "- ";
		}
		s += name.fullName + " [" + tag.tagName + "]";
		return s;		
	}
}
