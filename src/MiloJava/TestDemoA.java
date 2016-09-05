package MiloJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.sun.xml.internal.stream.Entity;

public class TestDemoA {
	@Test
	public void TestA() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i : arr) {
			System.out.println(i);
		}
	}

	@Test
	public void TestB() {
		List<String> list = new ArrayList<String>();
		list.add("AAA1");
		list.add("AAA2");
		list.add("AAA3");
		list.add("AAA4");
		list.add("AAA5");
		list.add("AAA6");
		for (String string : list) {
			System.out.println(string);
		}

	}

	@Test
	public void TestC() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "BBBB1");
		map.put(2, "BBBB2");
		map.put(3, "BBBB3");
		map.put(4, "BBBB4");
		map.put(5, "BBBB5");
		map.put(6, "BBBB6");
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer + " = " + map.get(integer));
		}
		for (Integer integer : map.keySet()) {
			System.out.println(map.get(integer));
		}
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(1, "BBBB11");
		map1.put(2, "BBBB12");
		map1.put(3, "BBBB13");
		map1.put(4, "BBBB14");
		map1.put(5, "BBBB15");
		map1.put(6, "BBBB16");
		Set<Entry<Integer, String>> set2 = map1.entrySet();
		Iterator<?> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<?, ?> entry = (Entry<?, ?>) it2.next();
			System.out.println(entry);

		}
		for (Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" === "+entry.getValue());
		}
	}

}
