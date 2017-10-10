import static org.junit.Assert.*;

import org.junit.Test;

public class TheItemTest {
	@Test
	public void shouldBeAbleToCreateAnItemOrder() {
		TheItem underTest = new TheItem("null",0.0, 0);
		assertNotNull(underTest);
	}
	@Test
	public void shouldBeAbleToReturnAPrice() {
		TheItem underTest = new TheItem("null",0.0, 0);
		assertNotNull(underTest);
	}
	@Test
	public void assertThatAddItemReturnsOne() {
		TheOrder underTest = new TheOrder();
		underTest.addItem(new TheItem("Test", 0.0, 1));
		underTest.addItem(new TheItem("Test", 0.0, 1));
		int check = underTest.qtyOfItems();
		assertEquals(check, 2);
	}
	
	
	
	
}
