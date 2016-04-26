package base;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class Person_TestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		
		PersonDomainModel person = new PersonDomainModel("Brian","Zankowsky","Main Street",19707,"Newark","1995-02-26");
		PersonDomainModel per = PersonDAL.addPerson(person);
		PersonDomainModel per2 = PersonDAL.getPerson(per.getPersonID());
		assertTrue(per.getPersonID()==per2.getPersonID());
		
	}

}
