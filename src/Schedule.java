import java.util.ArrayList;
import java.util.Collections;

public class Schedule{
    WorkingHours workingHours;
    ArrayList<Meeting> meetings;
    String name;
    public Schedule(String name){
        this.name=name;
    meetings= new ArrayList<Meeting>();
    }
    public String getName() {
        return name;
    }
    public void setWorkingHours(WorkingHours workingHours){
        this.workingHours=workingHours;
    }
    public void addMeeting(String start, String end){
        meetings.add(new Meeting(start, end));
        Collections.sort(this.meetings, new CustomComparator());
    }
    public void displayMeetings(){
        System.out.println(this.name + "'s meetings:");
        for(Meeting meetings : meetings){
            System.out.println(meetings.start + " - " + meetings.end);
        }
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void findSpaceForMeeting(double estimatedMeetingTime){
        System.out.println("Available meetings");
        float temp=workingHours.getStartTimeValue();
        String tempString=workingHours.start;
        for(Meeting meetings: meetings){
            if(meetings.getStartTimeValue()-temp>=estimatedMeetingTime){
                System.out.println(tempString + " - " + meetings.start);
            }
            temp=meetings.getEndTimeValue();
            tempString=meetings.end;
        }
        if(workingHours.getEndTimeValue()-temp>=estimatedMeetingTime){
            System.out.println(tempString + " - " + workingHours.end);
        }
    }
    public void mergeSchedule(Schedule secondPerson){
        for(Meeting meetings : secondPerson.meetings){
            this.addMeeting(meetings.start, meetings.end);
        }
        if(this.workingHours.getStartTimeValue()<secondPerson.workingHours.getStartTimeValue()){
            this.workingHours=secondPerson.workingHours;
        }
        if(this.workingHours.getEndTimeValue()>secondPerson.workingHours.getEndTimeValue()){
            this.workingHours=secondPerson.workingHours;
        }
        for(int i=0; i<this.meetings.size()-1; i++){
            if(meetings.get(i).getEndTimeValue()>meetings.get(i+1).getStartTimeValue()){
                if(meetings.get(i).getEndTimeValue()<meetings.get(i+1).getEndTimeValue()){
                    meetings.get(i).end=meetings.get(i+1).end;
                    meetings.remove(i+1);
                }
                else{
                    meetings.remove(i+1);
                }
            }
        }
    }
}
