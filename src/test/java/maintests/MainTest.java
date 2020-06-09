package maintests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import mainpkg.Main;
import mainpkg.NotImplemented;


class MainTest {
	
	@InjectMocks
	private static Main mainClass;
	
	@Mock
	private static NotImplemented notYet;
	
	boolean b;
	
	@BeforeAll
	static void set() {
		mainClass = new Main("ci",notYet);
		notYet = Mockito.mock(NotImplemented.class);
	}

	@Test
	public void test() {
		b = mainClass.firstTest();
		assertTrue(b);
	}
	
	@Test
	public void mockedTest() {
		Mockito.when(notYet.notImplementedMethod("ciao")).thenReturn(3);
		assertEquals(mainClass.toMock("ciao"),3);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	public void paramTestFalse(String candidate) {
		mainClass = new Main(candidate,notYet);
		b = mainClass.firstTest();
	    assertFalse(b);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "gino", "ella", "ale" })
	public void paramTestTrue(String candidate) {
		mainClass = new Main(candidate,notYet);
		b = mainClass.firstTest();
	    assertTrue(b);
	}
	
	
	

}
