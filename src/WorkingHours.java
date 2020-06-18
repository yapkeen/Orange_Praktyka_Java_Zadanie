public class WorkingHours {
String start;
String end;

public WorkingHours(String start, String end){
    this.start=start;
    this.end=end;
}
public float getStartTimeValue(){
    int temp = Integer.parseInt(start.substring(0, start.length()-3));
    int temp2= Integer.parseInt(start.substring(start.length()-2, start.length()));
    float timeValue=temp + ((float)temp2/60);
    return timeValue;
}
public float getEndTimeValue(){
    int temp = Integer.parseInt(end.substring(0, end.length()-3));
    int temp2= Integer.parseInt(end.substring(end.length()-2, end.length()));
    float timeValue=temp + ((float)temp2/60);
    return timeValue;
}
}
