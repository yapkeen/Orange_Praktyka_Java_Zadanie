import java.util.Comparator;

public class CustomComparator implements Comparator<Meeting> {

        public int compare(Meeting o1, Meeting o2) {
            if(o1.getStartTimeValue()>o2.getStartTimeValue()){
                return 1;
            }
            if(o1.getStartTimeValue()<o2.getStartTimeValue()){
                return -1;
            }
            return 0;
        }
}

