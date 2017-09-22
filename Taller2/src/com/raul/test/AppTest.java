package com.raul.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.raul.taller2.SuperWorld;

public class AppTest {
	@Test
	public void Test()
	{
		SuperWorld sword = new SuperWorld("anita lava la tina");
		Assert.assertEquals(true, sword.isPalindrom());
	}
	
	@Test
	public void Test2()
	{
		SuperWorld sword = new SuperWorld("ana");
		SuperWorld.Vocal v = new SuperWorld.Vocal('a', 2);
		ArrayList<SuperWorld.Vocal> b = sword.numberVocal();
		ArrayList<SuperWorld.Vocal> a = new ArrayList<SuperWorld.Vocal>();
		a.add(v);
		Assert.assertEquals(a.get(0).getVocal(), b.get(0).getVocal());
	}
}
