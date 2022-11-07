package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.SecteurActivite;
import com.esprit.examen.services.SecteurActiviteServiceImpl;


@SpringBootTest
public class SecteurActiviteServiceImplTest {

@Autowired
SecteurActiviteServiceImpl SecteurActiviteService;

    //testing Add method
    @Test
     void testAddSecteurActivite(){
        List<SecteurActivite> SecteurActivites = SecteurActiviteService.retrieveAllSecteurActivite();
        int expected = SecteurActivites.size();
        SecteurActivite o = new SecteurActivite();
        o.setLibelleSecteurActivite("aa");
        o.setCodeSecteurActivite("bbb");
        SecteurActivite savedSecteurActivite= SecteurActiviteService.addSecteurActivite(o);
        assertEquals(expected+1, SecteurActiviteService.retrieveAllSecteurActivite().size());
        assertNotNull(savedSecteurActivite.getLibelleSecteurActivite());
        SecteurActiviteService.deleteSecteurActivite(savedSecteurActivite.getIdSecteurActivite());

    }

    
    @Test
	public void testRetrieveSecteurActivite() {
		SecteurActivite s = new SecteurActivite();
		 s.setLibelleSecteurActivite("aa");
	     s.setCodeSecteurActivite("bbb");
		SecteurActivite savedSecteurActivite= SecteurActiviteService.addSecteurActivite(s);
		SecteurActivite getSecteurActivite= SecteurActiviteService.retrieveSecteurActivite(savedSecteurActivite.getIdSecteurActivite());
		assertNotNull(savedSecteurActivite.getLibelleSecteurActivite());
		assertNotNull(savedSecteurActivite.getCodeSecteurActivite());
		assertEquals(savedSecteurActivite.getIdSecteurActivite(),getSecteurActivite.getIdSecteurActivite());
		
		SecteurActiviteService.deleteSecteurActivite(savedSecteurActivite.getIdSecteurActivite());
		}
	
	@Test
	public void testUpdateSecteurActivite() {
		SecteurActivite s = new SecteurActivite();
		 s.setLibelleSecteurActivite("aa");
	     s.setCodeSecteurActivite("bbb");
		SecteurActivite savedSecteurActivite= SecteurActiviteService.addSecteurActivite(s);
		savedSecteurActivite.setLibelleSecteurActivite("skander");;
		SecteurActiviteService.updateSecteurActivite(savedSecteurActivite);
		assertEquals(s.getLibelleSecteurActivite(),savedSecteurActivite.getLibelleSecteurActivite());
		SecteurActiviteService.deleteSecteurActivite(savedSecteurActivite.getIdSecteurActivite());
		}
	
	@Test
	public void testDeleteSecteurActivite() {
		SecteurActivite s = new SecteurActivite();
		s.setLibelleSecteurActivite("aa");
	     s.setCodeSecteurActivite("bbb");
		SecteurActivite savedService= SecteurActiviteService.addSecteurActivite(s);
		SecteurActiviteService.deleteSecteurActivite(savedService.getIdSecteurActivite());
		assertNotNull(savedService.getIdSecteurActivite());
		
	}

}

