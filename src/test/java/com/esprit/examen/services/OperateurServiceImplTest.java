package com.esprit.examen.services;

import java.util.List;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.esprit.examen.entities.Operateur;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class OperateurServiceImplTest {

	@Mock
	@Autowired
	IOperateurService operateurService;
	@Test
	@Order(1)
	public void getOperateurs() {
		List<Operateur> list = operateurService.retrieveAllOperateurs();
		Assertions.assertEquals(0, list.size());
		
	}
}

