package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestPage{
	
	public static void main(String... args){
		List <Page> pageList = new ArrayList<Page>();
		A pageA = new A();
		B pageB = new B();
		B pageB1 = new B();

		insertPage(pageList, pageB);
		insertPage(pageList, pageA);
		
		getTitles(pageList);
		
		
		PageSort sort = new PageSort();
		Collections.sort(pageList, sort);
		getTitles(pageList);
		
	}
	
	public static void getTitles(List<? extends Page> titleList){
		Iterator<? extends Page> it = titleList.iterator();		
		while (it.hasNext()){
			System.out.println(it.next().getTitle());
		}
	}
	
	public static <E extends Page> void insertPage(List<Page> pageList, E element, List<Page> element2){
		pageList.add(element);
		element2.add(pageList.get(0));
		element2.add(null);
	}
	
	public static <E extends Page> void insertPage(List<Page> pageList, E element){
		pageList.add(element);
	}

}
