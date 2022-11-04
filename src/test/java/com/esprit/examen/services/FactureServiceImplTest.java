package com.esprit.examen.services;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.util.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Facture;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactureServiceImplTest {
	@Autowired
	IFactureService factureService;
	private static final Logger l =LogManager.getLogger(FactureServiceImplTest.class);
	@Test
	public void testgetAllFactures(){
		 	l.info("In testgetAllFactures()");
		 List<Facture> employes =factureService.retrieveAllFactures();
	     Assert.notNull(employes,"get factures null");
	     l.info("Out testgetAllFactures()");
	}
}
