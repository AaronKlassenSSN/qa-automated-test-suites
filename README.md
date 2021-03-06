Initial Setup
================

Create a folder called ssn_qa on your C drive.

Download and Extract the following zip file.  It contains most relevant files for setting up your local environment for automated test writing with Eclipse.

https://drive.google.com/open?id=0B_W9HkAivGoRY2hxMFd2MG9tU28

Install Maven
================
The Maven files should already be in C:\ssn_qa\maven.  Add the environment variable MAVEN_HOME and set it to C:\ssn_qa\maven, then append %MAVEN_HOME\bin% to the end of the Path variable.  To check that both are correctly set, open command prompt and type mvn -version.  If the variables are set up correctly, you will get some output showing the version and where it's located.  

Clone project
================

If you don't have it installed already, install and set up git.  
https://git-for-windows.github.io/


Navigate to C:\ssn_qa\testSuites using command prompt and clone the testing suite repository using the command "git clone [LINK TO REPOSITORY]".  

Now open Eclipse.  When you first open it, you may be prompted to select your workspace.  If you are, set the workspace to C:\ssn_qa\testSuites\ and click OK.  Select the checkbox next to "Use this as the default and do not ask again" and click OK.  If not, this is already set and there's no action required.  Once Eclipse starts click the orange "Workbench" button in the top right and you'll be taken to the default Eclipse screen.  Right click  in the Package explorer and click on Import.  When in the select screen, find Maven, expand it, and select Existing Maven Projects.  Set the root directory to your recently cloned repository (C:\ssn_qa\testSuites\qa-automated-test-suites\) and click finish.  

Click on the runSeleniumTests batch file and a chrome window will open, execute test cases, then close and a results page will open.
