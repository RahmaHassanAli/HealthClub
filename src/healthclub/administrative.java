package healthclub;

import java.util.Scanner;

// AdministrativeModule.java
public class administrative {
//    private int adminId;
//    private String username;
//    private String password;
//    private FileManager fileManager;
//
//    public administrative(int adminId, String username, String password) {
//        this.adminId = adminId;
//        this.username = username;
//        this.password = password;
//        this.fileManager = new FileManager("admin_data.txt");
//    }

    public void alterCredentials() {
        // Implementation for altering credentials
    }
    private static final Scanner input = new Scanner(System.in);
    public void manageAdministrative() {
        int choice;
        do {
            System.out.println("Please choose any service");
            System.out.println("===========================");
            System.out.println("1. Manage Coaches");
            System.out.println("2. Manage Members");
            System.out.println("0. Exit");
            System.out.println("===========================");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                   this.manageCoaches();
                    break;
                case 2:
                    this.manageMembers();
                    break;
                case 0:
                    System.out.println("Exiting Administrative Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    public void manageCoaches() {
        int choice;
        do {
            System.out.println("Please choose any service");
            System.out.println("===========================");
            System.out.println("1. Add new coach");
            System.out.println("2. Delete coach");
            System.out.println("3. Update coach");
            System.out.println("4. Get coach by ID");
            System.out.println("5. Get all coaches");
            System.out.println("0. Exit");
            System.out.println("===========================");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    CoachRepository.addCoach();
                    break;
                case 2:
                    CoachRepository.deleteCoach();
                    break;
                case 3:
                    CoachRepository.updateCoach();
                    break;
                case 4:
                    CoachRepository.getCoachById();
                    break;
                case 5:
                    CoachRepository.getAllCoaches();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }


    public void manageMembers() {
        int choice;
        do {
            System.out.println("Please choose any service");
            System.out.println("===========================");
            System.out.println("1. Add new member");
            System.out.println("2. Delete member");
            System.out.println("3. Update member");
            System.out.println("4. Get member by ID");
            System.out.println("5. Get all members");
            System.out.println("0. Exit");
            System.out.println("===========================");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    MemberRepository.addMember();
                    break;
                case 2:
                    MemberRepository.deleteMember();
                    break;
                case 3:
                    MemberRepository.updateMember();
                    break;
                case 4:
                    MemberRepository.getMemberById();
                    break;
                case 5:
                    MemberRepository.getAllMembers();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }


    public void manageBilling() {
        // Implementation for managing billing
    }

    public void generateMemberReports() {
        // Implementation for generating member reports
    }

    public void assignCoach(int memberId, int coachId) {
        // Implementation for assigning a coach to a member
    }

    public void sendSubscriptionEndNotification(int memberId) {
        // Implementation for sending subscription end notification
    }
}
