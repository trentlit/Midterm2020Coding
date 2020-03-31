package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;

public class EllipseTest {

	@Test
	public void EllipseTest() throws Exception{
		Ellipse elli = new Ellipse(10,20);
		assertEquals(628.32,elli.area(),.01);
	}
	

}
