import com.jjheers.github.issues.OpenIssuesApi;
import com.jjheers.github.issues.SavedIssuesApi;
import com.jjheers.github.repos.RepoIssueRepository;
import com.jjheers.github.repos.SavedRepo;

public class GitHubProject {

    public static void main(String[] args) {
        try (GitHubClient client = new GitHubClient()) {
            OpenIssuesApi openIssuesApi = client.getOpenIssuesApi();
            SavedIssuesApi savedIssuesApi = client.getSavedIssuesApi();

            RepoIssueRepository repoIssueRepository = new RepoIssueRepository(client, openIssuesApi);
            SavedRepo savedRepo = new SavedRepo(savedIssuesApi, repoIssueRepository);

            // Example code to interact with GitHub API
            System.out.println("GitHub Issues: " + openIssuesApi.searchIssues(null, 0, 50));
            System.out.println("GitHub Repo: " + savedRepo.getRepoInfo());
        }
    }
}
