# Notes (Learning Record)

## Steps, Findings and Prompts
1. Generate repository
   
   **Findings**
   > GitHub Copilot Chat in IntelliJ couldn't understand my query, not responsive, switching into VS Code.
   > Talk to GitHub Copilot Chat in VS Code.
   
   **Chat Records**
   
   _chats when workspace at the parent repo_
   > can you create a spring boot java repo with gradle?
   - (response seems to helpful, but manual steps from terminal. I'm lazy, let's try with workspace command)
   
   > @workspace /new scaffold a Java springboot project
   - ("Create workspace" available, but the entry point is not what I want)
   
   > @workspace /new can you use gradle instead of pom
   - (Let's go! "Create workspace" works. It creates "my-springboot-app" folder)
   
   _responses are helpful for learning, but cannot apply the commands when run on the parent repo_
   > can you add gradle wrapper into this repo?
   > @workspace can you add gradle wrapper for me
   > @terminal help me include gradle wrapper
   
   _open the "my-springboot-app" workspace_

   **TODOs**
   > - [ ] Explore what GitHub Copilot Chat can do in IntelliJ.

2. Initial set up verification
   
   **Findings**
   All done in VS Code. `./gradlew test` is runnable but fails. **Commit!!** before manual fixing.

   ```
   MyApplicationTests > initializationError FAILED
    java.lang.IllegalStateException at Assert.java:76
   ```
   
   **Chat Records**
   > can you add gradle wrapper into this repo?
   - (instructions given , but need to manually run the command from terminal) 😑

   > "@workspace /fix"
   - (flagging hardcoded-credentials, though not the functional fix) 👍

   > can you help me fix the contextLoads test?
   - (unproductive chat responses, let's try other way)

   > Why java.lang.IllegalStateException when running the Spring Boot Test ?
   - (a long context and 5 possible causes). Helpful hint to troubleshoot: Spring Context Configuration Issues, Application-specific Configuration. Not helpful suggestion: check stack trace, stack trace is short.

   > what is causing java.lang.IllegalStateException at Assert.java:76 👍
   - Helpful response: general guidelines for troubleshooting java.lang.IllegalStateException in Spring Boot tests.
3. [ ] Fix the test

   **Findings**
   blah..

   **Chat Records**
   > can you help me to write a docker-compose file to spin up a mysql db ?
   - (docker-compose.yml seems legit. Update application.properties to verify) ⏲️

   **TODO**
   - [ ] Identify root cause of test failure.
     - `./gradlew test` still `java.lang.IllegalStateException` even with `docker-compose up`. What's the problem?
     - `./gradlew bootRun` gives below output. Invalid `build.gradle`?
   - [X] Test with Java upgrade. Use Java version 22 without upgrading gradle version. Outputs:
       ```
       MyApplicationTests > initializationError FAILED
         org.springframework.beans.factory.BeanDefinitionStoreException at ClassPathScanningCandidateComponentProvider.java:452
           Caused by: org.springframework.core.NestedIOException at SimpleMetadataReader.java:60
             Caused by: java.lang.IllegalArgumentException at ClassReader.java:199
       ```
   - [X] Resolve `./gradlew bootRun`.
   - [ ] `./gradlew test` still fails. Let's comment out SpringBootTest.
4. [ ] Switch to use latest Java? It's using global outdated Java/Gradle.

   **Findings**
   Use Java version 22.

   **Chat Records**
   > which is the latest gradle version compatible with java 22
   - As of my last update in April 2023, Java 22 has not been released ... it's advisable to check the official Gradle documentation 🤣

   **TODO**
   - [ ] blah..
5. [ ] Update the README ??