
public class AgeValidation {

	public String ageValidator(int age) {
		if(age>=18) {
			return "valid age to vote";
		}
		else{
			return "invalid age to vote";
		}
	}

}
