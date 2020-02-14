package numericalTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class TestRunnerNumerical {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(NumericalTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}

}
