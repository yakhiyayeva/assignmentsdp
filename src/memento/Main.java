package memento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        while (true) {
            System.out.println("\nDocument Content: " + document.getContent());
            System.out.println("1. Edit Content");
            System.out.println("2. Save Version");
            System.out.println("3. List Versions");
            System.out.println("4. Restore Version");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // Read the user choice
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1: // Edit content
                    System.out.print("Enter new content: ");
                    String newContent = scanner.nextLine();
                    document.setContent(newContent);
                    break;

                case 2: // Save version
                    System.out.print("Enter version name: ");
                    String versionName = scanner.nextLine();
                    versionControl.saveVersion(document.save(), versionName);
                    System.out.println("Version saved!");
                    break;

                case 3: // List versions
                    System.out.println("Saved Versions:");
                    versionControl.listVersions();
                    break;

                case 4: // Restore version
                    System.out.println("Enter version number to restore:");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();  // Clear invalid input
                        continue;
                    }

                    int versionIndex = scanner.nextInt() - 1;
                    scanner.nextLine();  // Consume the newline character
                    DocumentVersion version = versionControl.getVersion(versionIndex);
                    if (version != null) {
                        document.restore(version);
                        System.out.println("Document restored to version " + (versionIndex + 1));
                    } else {
                        System.out.println("Invalid version number.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid number.");
            }
        }
    }
}
