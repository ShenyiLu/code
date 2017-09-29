import java.util.Comparator;

public class WidgetByValueComparator implements Comparator<Widget>{

	@Override
	public int compare(Widget o1, Widget o2) {
		return o1.getValue() - o2.getValue();
	}

}
