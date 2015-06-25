package openNow;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class IsOpenNowTest {

	@Test
	public void test() {
		assertTrue(IsOpenNow.isOpenNow(Calendar.SUNDAY, 1));
		assertFalse(IsOpenNow.isOpenNow(Calendar.SUNDAY, 4));
		assertTrue(IsOpenNow.isOpenNow(Calendar.MONDAY, 20));
		assertTrue(IsOpenNow.isOpenNow(Calendar.MONDAY, 2));
		assertTrue(IsOpenNow.isOpenNow(Calendar.MONDAY, 0));
		assertFalse(IsOpenNow.isOpenNow(Calendar.MONDAY, 10));		
		assertTrue(IsOpenNow.isOpenNow(Calendar.TUESDAY, 18));
		assertFalse(IsOpenNow.isOpenNow(Calendar.WEDNESDAY, 20));
		assertFalse(IsOpenNow.isOpenNow(Calendar.THURSDAY, 12));
		assertFalse(IsOpenNow.isOpenNow(Calendar.THURSDAY, 3));
		assertTrue(IsOpenNow.isOpenNow(Calendar.FRIDAY, 20));
		assertTrue(IsOpenNow.isOpenNow(Calendar.FRIDAY, 5));
		assertFalse(IsOpenNow.isOpenNow(Calendar.FRIDAY, 6));		
		assertTrue(IsOpenNow.isOpenNow(Calendar.SATURDAY, 4));
	}

}
