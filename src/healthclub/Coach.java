package healthclub;

import java.util.List;

public class Coach extends User {
    private int coachId;
    private String name;
    private FileManager fileManager;

    public Coach(int coachId, String username, String password, String name) {
        super(coachId, username, password);
        this.coachId = coachId;
        this.name = name;
        this.fileManager = new FileManager("coach_data.txt");
    }
//     FileManager getFileManager(){
//        return fileManager;
//     }

    public void createPlan(int memberId) {
        // Implementation for creating a plan for a member
    }

    public int getCoachId() {
        return coachId;
    }

    public String getName() {
        return name;
    }

    public void createSchedule(int memberId) {
        // Implementation for creating a schedule for a member
    }

    public void sendMessage(List<Member> members) {
        // Implementation for sending a message to members
    }
    @Override
    public String toString() {
        return  coachId+ ", Name: " + name+", UserName :"+super.getUsername()+", Password :"+super.getPassword();
    }

}