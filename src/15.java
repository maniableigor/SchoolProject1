import java.util.Scanner;

public class SimpleGitHubProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to GitHub.");
        
        // Ask user for their name
        System.out.print("Please enter your name: ");
        String username = scanner.nextLine();
        System.out.print("Welcome, " + username + "! How can I assist you today? Please choose one of the following options:\n1. List repositories\n2. Clone a repository\n3. Create a new branch\n4. Delete a branch\n5. Commit and push changes\n6. Pull request\n7. Search GitHub for files\n8. Exit the application");
        
        // Loop through available commands
        while (true) {
            System.out.print("\nPlease choose an option:\n1. List repositories\n2. Clone a repository\n3. Create a new branch\n4. Delete a branch\n5. Commit and push changes\n6. Pull request\n7. Search GitHub for files\n8. Exit the application: ");
            
            String command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
            switch (command) {
                case "1":
                    System.out.print("\nHere are some repositories you can list:\n\n");
                    ListRepositories.listRepositories(username);
                    break;
                case "2":
                    System.out.print("Enter the name of a repository: ");
                    String repositoryName = scanner.nextLine().trim();
                    if (repositoryName.isEmpty()) {
                        System.out.println("Repository name is empty. Please enter a valid name.");
                    } else {
                        ListRepositories.cloneRepository(username, repositoryName);
                    }
                    break;
                case "3":
                    System.out.print("Enter the name of a branch to create: ");
                    String branchName = scanner.nextLine().trim();
                    if (branchName.isEmpty()) {
                        System.out.println("Branch name is empty. Please enter a valid name.");
                    } else {
                        ListRepositories.createNewBranch(username, branchName);
                    }
                    break;
                case "4":
                    System.out.print("Enter the name of a branch to delete: ");
                    String branchToDelete = scanner.nextLine().trim();
                    if (branchToDelete.isEmpty()) {
                        System.out.println("Branch name is empty. Please enter a valid name.");
                    } else {
                        ListRepositories.deleteBranch(username, branchToDelete);
                    }
                    break;
                case "5":
                    System.out.print("Enter the name of a new branch: ");
                    String newBranchName = scanner.nextLine().trim();
                    if (newBranchName.isEmpty()) {
                        System.out.println("Branch name is empty. Please enter a valid name.");
                    } else {
                        ListRepositories.commitAndPushChanges(username, newBranchName);
                    }
                    break;
                case "6":
                    System.out.print("Enter the name of a pull request: ");
                    String pullRequestName = scanner.nextLine().trim();
                    if (pullRequestName.isEmpty()) {
                        System.out.println("Pull request name is empty. Please enter a valid name.");
                    } else {
                        ListRepositories.searchForFiles(username, pullRequestName);
                    }
                    break;
                case "7":
                    System.out.print("Enter the file names to search for: ");
                    ListRepositories.searchGitHubFiles(username, scanner.nextLine().trim());
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
        
        System.out.println("\nGoodbye! Have a nice day!");
    }

    // Define the function listRepositories that will list repositories
    private static void ListRepositories() {
        System.out.print("Please enter your username: ");
        String username = scanner.nextLine().trim();
        if (username.isEmpty()) {
            System.out.println("Username is empty. Please enter your GitHub username.");
        } else {
            ListRepositories.listRepositories(username);
        }
    }

    // Define the function listRepositories that will clone a repository
    private static void CloneRepository(String username, String repositoryName) {
        System.out.print("Please enter the name of the repository: ");
        String repository = scanner.nextLine().trim();
        if (repository.isEmpty()) {
            System.out.println("Repository name is empty. Please enter a valid name.");
        } else {
            System.out.print("\nDo you want to create a new branch or delete it? Enter 1 for creating a new branch and 2 for deleting:\n");
            String choice = scanner.nextLine().trim();
            
            if (choice.equalsIgnoreCase("1")) {
                System.out.print("Enter the name of the new branch: ");
                String newBranchName = scanner.nextLine().trim();
                
                if (newBranchName.isEmpty()) {
                    System.out.println("New branch name is empty. Please enter a valid name.");
                } else {
                    ListRepositories.cloneRepository(username, repositoryName, newBranchName);
                }
            } else if (choice.equalsIgnoreCase("2")) {
                ListRepositories.deleteBranch(username, repositoryName);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Define the function createNewBranch that will create a new branch
    private static void CreateNewBranch(String username, String branchName) {
        System.out.print("\nEnter the name of the branch: ");
        String branch = scanner.nextLine().trim();
        
        if (branch.isEmpty()) {
            System.out.println("Branch name is empty. Please enter a valid name.");
        } else {
            ListRepositories.createNewBranch(username, branchName);
        }
    }

    // Define the function deleteBranch that will delete a branch
    private static void DeleteBranch(String username, String branchToDelete) {
        System.out.print("\nEnter the name of the branch to delete: ");
        String branchToDelete = scanner.nextLine().trim();
        
        if (branchToDelete.isEmpty()) {
            System.out.println("Branch name is empty. Please enter a valid name.");
        } else {
            ListRepositories.deleteBranch(username, branchToDelete);
        }
    }

    // Define the function commitAndPushChanges that will commit and push changes
    private static void CommitAndPushChanges(String username, String newBranchName) {
        System.out.print("Enter the name of the file(s): ");
        scanner.nextLine(); // Clear buffer for newline character
        ListRepositories.searchForFiles(username, scanner.nextLine().trim());

        if (newBranchName.isEmpty()) {
            System.out.println("New branch name is empty. Please enter a valid name.");
        } else {
            ListRepositories.commitAndPushChanges(username, newBranchName);
        }
    }

    // Define the function searchForFiles that will search for files in GitHub
    private static void searchForFiles(String username, String fileNames) {
        System.out.print("Enter the names of the files to search for: ");
        scanner.nextLine(); // Clear buffer for newline character

        ListRepositories.searchGitHubFiles(username, fileNames);
    }
}
