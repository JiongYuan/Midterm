package Exception;
import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person personException;
	
	public PersonException(Person person){
		this.personException = person;
	}

}
