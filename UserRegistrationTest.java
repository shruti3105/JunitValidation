package DummyTesting;
import org.junit.Test;
import org.junit.Assert;
public class UserRegistrationTest {
	public void firstName() {
		ValidationTest test = new ValidationTest();
		boolean result = test.validateFirstName("Shruti");
		Assert.assertEquals(true,result);
	}
}
