package com.esprit.examen.services;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.esprit.examen.entities.Stock;

import com.esprit.examen.repositories.StockRepository;
import com.esprit.examen.services.IStockService;
import com.esprit.examen.services.StockServiceImpl;
@ExtendWith(MockitoExtension.class)

public class StockserviceTestMock {
	@Mock
	StockRepository stockRepository;
	@InjectMocks
	StockServiceImpl stockService ;

	Stock s = new Stock((long)1,"testLibelle1",10,150, null);
	Stock s1 = new Stock((long)2,"testLibelle1",50,100,null);
	Stock s2 = new Stock((long)3,"testLibelle2",5,80,null);
	List<Stock> stock = new ArrayList<Stock>() {{add(s1); add(s2);}}; 
	
	@Test
	public void testGetAllStock() {
		stockService.retrieveAllStocks();
		verify(stockRepository).findAll();
	}
	
	@Test
	public void testGetStock() {
		Mockito.when(stockRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(s));
		assertNotNull(stockService.retrieveStock((long)3));	
	}
	
	@Test
	public void testaddStock() {
		Mockito.when(stockRepository.save(Mockito.any(Stock.class))).thenReturn(s);
		assertNotNull(stockService.addStock(s));
		//verify(stockRepository).save(s);
	}
	
	@Test
	public void testUpdateStock() {
		Mockito.when(stockRepository.save(Mockito.any(Stock.class))).thenReturn(s);
		s.setQte(55);
		assertNotNull(stockService.updateStock(s));	
		assertEquals(55, s.getQte());
	}
	
	
	@Test
	public void testDeleteStock() {
		stockService.deleteStock((long)3);
		verify(stockRepository).deleteById((long)3);
	}
	
	
	
	
	
	
	
	
	
	
}