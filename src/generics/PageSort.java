package generics;

import java.util.Comparator;

public class PageSort implements Comparator<Page>{

	@Override
	public int compare(Page o1, Page o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
