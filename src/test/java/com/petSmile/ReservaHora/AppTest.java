package com.petSmile.ReservaHora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.petSmile.ReservaHora.App;

public class AppTest {
    

	public AppTest() {
		
	}
	
	@BeforeClass
	public static void setUpClass() {
		
	}
	
	@AfterClass
	public static void tearDownClass() {
		
	}
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testConexion() {
		System.out.println("Test Conexión");
		
		try {
			String msg = "";
			boolean conexionOk = true;
			
			if(App.getConexion() != null) {
				msg = "Conexión a BD clinica realizada con exito";
			}else {
				msg = "Conexión a BD clinica fallida";
				conexionOk = false;
			}
			System.out.println(msg);
			assertEquals(conexionOk, true);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	
	
}