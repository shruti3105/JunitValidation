package DummyTesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
	 
@RunWith(Parameterized.class)
public class EmailValidation {
		
		
		private String emailTest;
			private boolean expectedResultt;
			
			public EmailValidation(String emailId, boolean expectedResult)
			{
				this.emailTest = emailId;
				this.expectedResultt = expectedResult;
			}
			@Parameterized.Parameters
			public static Collection data()
			{
			return Arrays.asList(new Object [][] { {"abc@yahoo.com",true},
													{"abc-100@yahoo.com",true},
													{"abc.100@yahoo.com",true},
													{"abc111@abc.com",true},
													{"abc-100@abc.net",true},
													{"abc.100@abc.com.au",true},
													{"abc@1.com", true},
													{"abc@gmail.com.com", true},
													{"abc+100@gmail.com", false},
													{"abc", false},
													{"abc123@gmail.a", false},
													{"abc123@.com", false},
													{".abc@abc.com", true},
													{"abc()*@gmail.com", false},
													{"abc..2002@gmail.com", true},
													{"abc.@gmail.com", true},
													{"abc@abc@gmail.com", false},
													{"abc@gmail.com.1a", false},
													
				});
			}
			@Test
			public void givenEmailAsVar_ShouldReturnPerfectResult()
			{
				UserRegistration ur= new UserRegistration();
				boolean result1;
				try {
					result1 = ur.checkEmailId(emailTest);
					Assert.assertEquals(expectedResultt,result1);
				} catch (InvalidEmailException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				
			}

	}


}
