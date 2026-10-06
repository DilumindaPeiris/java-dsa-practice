# Publish to GitHub

1. Extract the ZIP and open the `java-dsa-practice` folder in VS Code.
2. Run the commands in README.md to compile and check the project.
3. On GitHub, create a repository named `java-dsa-practice`. Choose Public
   if you want employers to view it. Leave README, license, and .gitignore
   initialization unchecked because the project already contains files.
4. In the VS Code terminal, run the following, replacing YOUR_USERNAME
   with your GitHub username. Use an email associated with your GitHub
   account, or your exact GitHub-provided noreply address from Settings → Emails.

```sh
git init -b main
git config user.name "YOUR_NAME"
git config user.email "YOUR_GITHUB_COMMIT_EMAIL"
git add .
git commit -m "Add Java sorting examples and correctness checks"
git remote add origin https://github.com/YOUR_USERNAME/java-dsa-practice.git
git push -u origin main
```

Authenticate using Git's browser flow or credential manager if prompted.
Do not put tokens or passwords in project files.

5. Open the repository's Actions tab to see the Java checks.
6. Suggested description: Java data structures and algorithms practice with
   sorting examples, complexity notes, and automated correctness checks.
7. Suggested topics: java, algorithms, data-structures, sorting, learning.

## Your next contribution

Add `src/LinearSearch.java` with a method that returns the first matching
index or -1. Include examples for missing values and duplicates, update the
README, run your checks, and commit the finished change.
