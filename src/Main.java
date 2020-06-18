public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Schedule schedule = new Schedule("Piotr");
    schedule.setWorkingHours(new WorkingHours("9:00", "20:00"));
    schedule.addMeeting("12:00", "13:00");
    schedule.addMeeting("16:30", "18:00");
    schedule.addMeeting("9:00", "10:30");
    schedule.displayMeetings();

    Schedule secondSchedule = new Schedule("Patryk");
    secondSchedule.setWorkingHours(new WorkingHours("8:00", "19:00"));
    secondSchedule.addMeeting("10:00", "11:30");
    secondSchedule.addMeeting("12:30", "14:30");
    secondSchedule.addMeeting("14:30", "14:45");
    secondSchedule.addMeeting("15:00", "17:00");
    secondSchedule.displayMeetings();

    MeetingPlanner meetingPlanner = new MeetingPlanner();
    meetingPlanner.findAvailableMeeting(schedule, secondSchedule, "00:15");

    }
}
