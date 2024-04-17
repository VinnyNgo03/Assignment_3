import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilsTest {

	private String string1;
	private String string2;
	private String expectedResult;
	
	public StringUtilsTest(String string1, String string2, String expectedResult) {
		this.string1 = string1;
		this.string2 = string2;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"hello", "world", "helloworld"},
			{"hellow", "orld", "helloworld"},
			{"hello", "world", "hello"},
			{"a", "b", "c"},
			{1, 2, 3},
			{"c", "c", "cc"}
		});
	}
	
	@Test
	public void testConcat() {
		String actualResult = StringUtils.concat(string1,string2);
		assertEquals(expectedResult, actualResult);
	}

}
