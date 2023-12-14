package healthclub;

import java.util.Date;

public class Member extends User {
    private int memberId;
    private String name;
    private Date subscriptionEndDate;
    private Coach coach;
    private Schedule schedule;
    private FileManager fileManager;

    public Member(int memberId, String username, String password, String name, Date subscriptionEndDate) {
        super(memberId, username, password);
        this.memberId = memberId;
        this.name = name;
        this.subscriptionEndDate = subscriptionEndDate;
        this.fileManager = new FileManager("member_data.txt");
    }

    public Date viewSubscriptionEndDate() {
        // Implementation for viewing subscription end date
        return subscriptionEndDate;
    }

    public Coach viewCoach() {
        // Implementation for viewing assigned coach
        return coach;
    }

    public Schedule viewSchedule() {
        // Implementation for viewing schedule
        return schedule;
    }

    public void receiveSubscriptionEndNotification() {
        // Implementation for receiving subscription end notification
    }
    @Override
    public String toString() {
        return memberId + ", Name: " + name + " UserName " + super.getUsername() + " Password :" + super.getPassword()
                + ", Subscription End Date: " + subscriptionEndDate;
    }
}
