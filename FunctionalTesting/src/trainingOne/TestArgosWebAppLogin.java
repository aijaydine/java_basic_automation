package trainingOne;

public class TestArgosWebAppLogin {

	public static void main(String[] args) {
		ArgosWebAppLogin testLogin = new ArgosWebAppLogin();
		
		testLogin.setUp();
//		testLogin.createLogin();
//		testLogin.verifyCreateLogin();
		testLogin.validLogin();
		testLogin.verifyValidLogin();
		testLogin.tearDown();

		
		
		

	}

}
