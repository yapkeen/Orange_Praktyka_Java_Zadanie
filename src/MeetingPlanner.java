
public class MeetingPlanner {

    public void findAvailableMeeting(Schedule firstSchedule, Schedule secondSchedule, String estimatedTime) {
        System.out.println(firstSchedule.getName() + "'s & " + secondSchedule.getName() + "'s");
        Schedule temp = new Schedule(firstSchedule.getName() + " & " + secondSchedule.getName());
        for(Meeting meetings : firstSchedule.meetings){
            temp.addMeeting(meetings.start, meetings.end);
        }
        temp.setWorkingHours(firstSchedule.workingHours);
        temp.mergeSchedule(secondSchedule);
        temp.findSpaceForMeeting(getEstimatedTimeValue(estimatedTime));
    }
    public float getEstimatedTimeValue(String estimatedTime){
        int temp = Integer.parseInt(estimatedTime.substring(0, estimatedTime.length()-3));
        int temp2= Integer.parseInt(estimatedTime.substring(estimatedTime.length()-2, estimatedTime.length()));
        float timeValue=temp + ((float)temp2/60);
        return timeValue;
    }
}
