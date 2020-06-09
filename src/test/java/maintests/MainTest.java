package maintests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import mainpkg.Main;

class MainTest {
	
	private static Main mainClass;
	boolean b;
	
	@BeforeAll
	static void set() {
		mainClass = new Main("ci");
	}

	@Test
	public void test() {
		b = mainClass.firstTest();
		assertTrue(b);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	public void paramTestFalse(String candidate) {
		mainClass = new Main(candidate);
		b = mainClass.firstTest();
	    assertFalse(b);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "gino", "ella", "ale" })
	public void paramTestTrue(String candidate) {
		mainClass = new Main(candidate);
		b = mainClass.firstTest();
	    assertTrue(b);
	}

}
