package com.platform.project.myTest;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

	@Test
	public void checkString() {

		String str = "Junit works fine";
		Assert.assertEquals("Junit works fine", str);
		Assert.assertTrue(str.equals("Junit works fine"));
	}

}
