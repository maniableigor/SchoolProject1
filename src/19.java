import com.github.johnrengelmanodemaster.githubapi.GitHubApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {

    @Autowired
    private GitHubApi githubApi;

    @GetMapping("/repos")
    public String getRepos() {
        try {
            // Add your code here to retrieve repositories from GitHub API
            return "Your repository URL";
        } catch (Exception e) {
            return "Error retrieving repositories.";
        }
    }

    @GetMapping("/repos/{username}/{repoName}")
    public String getRepo(@PathVariable("username") String username, @PathVariable("repoName") String repoName) {
        try {
            // Add your code here to retrieve a specific repository from GitHub API
            return "You have successfully retrieved the repository: " + repoName;
        } catch (Exception e) {
            return "Error retrieving the repository.";
        }
    }
}
