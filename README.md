# NY_Dashboard_Automation

This repository contains an automated driver suite built using Selenium WebDriver with Java. The automation covers the following core workflows:

# Features


**1. BAP Login Flow**
  Automates the login process for Backend Aggregator Platform (BAP) users.

    Includes:

      Navigation to the dashboard.
  
      Credential input and form submission.
  
      Validation of successful login.


**2. BPP Login Flow**
    Automates the login process for Backend Provider Platform (BPP) users.

    Steps include credential input, verification.

**3. Ride Flow**
    Simulates an end-to-end ride booking process, including:

      Selecting pickup and drop-off locations.
  
      Validating ride availability.
  
      Confirming ride booking.

      Start and end the ride.

**4. User Ride Cancellation Flow**
   Automates the ride cancellation process initiated by the user.

   Includes:

    Accessing user the active ride.
  
    Triggering cancellation.
  
    Verifying cancellation confirmation or messages.


# Tech Stack

    1. Programming Language: Java

    2. Automation Framework: Selenium WebDriver

    3. Test Framework: TestNG 

    4. Build Tool: Maven


# Setup Instructions

    To set up and run the automated suite:

    1. Clone the repository: git clone "repo link".
   
    2. Import the project into your IDE (e.g., IntelliJ, Eclipse).
   
    3. Install dependencies (e.g., Selenium, TestNG) via Maven.
   
    4. Update configurations, such as URLs, credentials, or environment variables.

    5. Open terminal , change your directory to your project folder and then type "mvn clean test" in terminal. 
  


# Usage

    1. Run the automation suite to validate login, ride, and cancellation flows.

    2. Integrated with CI/CD tools like Jenkins for continuous testing.



# Contributing

    Feel free to fork this repository and submit pull requests for improvements.



# Sample web view of generated report


<img width="1728" alt="Screenshot 2024-12-17 at 5 24 23 PM" src="https://github.com/user-attachments/assets/bd36bf09-4a88-49af-9955-202ba8cac737" />

