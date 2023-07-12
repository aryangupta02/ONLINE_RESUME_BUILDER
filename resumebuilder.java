import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Resume Builder!");

        // Prompt user for personal information
        System.out.println("Please enter your personal information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        // Prompt user for education details
        System.out.println("\nEducation:");
        System.out.print("Degree: ");
        String degree = scanner.nextLine();
        System.out.print("Major: ");
        String major = scanner.nextLine();
        System.out.print("University: ");
        String university = scanner.nextLine();
        System.out.print("Graduation Year: ");
        int graduationYear = scanner.nextInt();

        scanner.nextLine(); // Clear the input buffer

        // Prompt user for work experience details
        System.out.println("\nWork Experience:");
        System.out.print("Company: ");
        String company = scanner.nextLine();
        System.out.print("Position: ");
        String position = scanner.nextLine();
        System.out.print("Start Date (MM/YYYY): ");
        String startDate = scanner.nextLine();
        System.out.print("End Date (MM/YYYY): ");
        String endDate = scanner.nextLine();
        System.out.print("Responsibilities: ");
        String responsibilities = scanner.nextLine();

        // Prompt user for skills
        System.out.println("\nSkills:");
        System.out.println("Please enter your skills (one per line, leave blank to finish):");
        String skill = scanner.nextLine();
        StringBuilder skills = new StringBuilder();
        while (!skill.isEmpty()) {
            skills.append(skill).append(", ");
            skill = scanner.nextLine();
        }
        skills.delete(skills.length() - 2, skills.length()); // Remove trailing comma and space

        // Generate the resume
        System.out.println("\nGenerating your resume...\n");

        // Print the resume
        System.out.println("============ Resume ============");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("\nEducation:");
        System.out.println("Degree: " + degree);
        System.out.println("Major: " + major);
        System.out.println("University: " + university);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("\nWork Experience:");
        System.out.println("Company: " + company);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Responsibilities: " + responsibilities);
        System.out.println("\nSkills: " + skills.toString());
        System.out.println("================================");

        System.out.println("\nThank you for using the Online Resume Builder!");
    }
}
