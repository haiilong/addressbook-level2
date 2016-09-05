package seedu.addressbook.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class SimilarNameTest {

	public Name name;
	
	@Before
    public void initialize() throws IllegalValueException {
        name = new Name("JOHn sIMPson xD");
    }
}
