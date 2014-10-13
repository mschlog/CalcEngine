//Matthew Schlogel

//imports
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class CalcUT extends TestCase {

	@Test
	public void TestCalculate() {
		assertEquals(11007, (Calc.Calculate(10000.0, 3.0, 3.25)));
	}
	//Could not get to work, JUnit seems to think that there are no tests
	//being run although there are no errors in the console.
}
