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
	
	@Test
	public void isSimilar_sameCase_isTrue() throws IllegalValueException {
		Name testName = new Name("john simpson xd");
		boolean result = name.isSimilar(testName);
		assertEquals(result, true);
	}
	
	@Test
	public void isSimilar_null_showError() throws IllegalValueException {
		Name testName = null;
		boolean result = name.isSimilar(testName);
		assertEquals(result, false);
	}
	
	@Test
	public void isSimilar_isDifferentOrder_isTrue() throws IllegalValueException {
		Name testName = new Name("xD Simpson John");
		boolean result = name.isSimilar(testName);
		assertEquals(result, true);
	}
}
