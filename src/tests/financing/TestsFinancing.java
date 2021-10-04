package tests.financing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class TestsFinancing {
	
	@Test
	public void constructShouldCreateObjectWhenValidData() {
		
		// arrange
		
		// action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// assert
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80,  f.getMonths());
		
	}

	@Test
	public void constructShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		// arrange
		
		// action
		
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
		
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);		
		
		// action
		f.setTotalAmount(90000.0);
		
		// assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
		
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		// arrange
		
		// action
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);	
			f.setTotalAmount(110000.0);
		});
		
	}
	
	@Test
	public void setIncomeAmountShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);		
		
		// action
		f.setIncome(2100.0);
		
		// assert
		Assertions.assertEquals(2100.0, f.getIncome());
		
	}

	@Test
	public void setIncomeAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		// arrange
		
		// action
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);	
			f.setIncome(1900.00);
		});
		
	}
	
	@Test
	public void setMonthsAmountShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);		
		
		// action
		f.setMonths(81);
		
		// assert
		Assertions.assertEquals(81, f.getMonths());
		
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		// arrange
		
		// action
		
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);	
			f.setMonths(79);
		});
		
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);		
			
		// action
	
				
		// assert
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);		
			
		// action
	
				
		// assert
		Assertions.assertEquals(1000.0, f.quota());
	}

}
