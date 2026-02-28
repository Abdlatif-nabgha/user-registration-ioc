#  Implementing a User Registration Service

In this exercise, you will design and implement a User Registration Service that allows
users to register by providing their name, email, and password. The system will save the
user in a repository and simulate sending a notification to the user after registration. The
mail server settings (such as host and port) for sending notifications should be
configurable via the application.properties file. This is a simulation, and no actual emails
will be sent.

## Class Diagram
<img src="images/1.png">

### Steps
1. <b>Define the User class:</b> <br />
   • Attributes: <br/>
   • id (Long) <br />
   • email (String) <br />
   • password (String) <br />
   • name (String) <br />
2. <b>Implement the UserRepository interface:</b> <br />
   • Define the UserRepository interface with a single method <br />
   • save(User user): void <br />
   • Implement the UserRepository interface in a class called <br />
   InMemoryUserRepository. Use a HashMap to store users in memory, with the
   email address as the key and the User object as the value.
3. <b>Implement the NotificationService interface: </b>
   • Define a NotificationService with a method: <br />
   • send(String message, String recipientEmail): void <br />
   • Create an EmailNotificationService that implements this interface and
   simulates sending an email by printing to the console. <br />
   • The mail server settings (such as host and port) should be read from the
   application.properties file and printed as part of the simulated email sending
   process. <br />
4. <b>Design the UserService class:</b> <br />
   • The UserService should: <br />
   • Register a new user using the UserRepository. <br />
   • Send a confirmation notification using the NotificationService. <br />
   • Ensure that UserService can work with any implementation of
   NotificationService, making the notification method easily replaceable. <br />
5. <b>Test the registration system:</b> <br />
   • In your main method, create an instance of UserService and call the
   registerUser() method. <br />
   • Verify that the user is saved and a confirmation message is printed to the
   console simulating an email notification. <br />
6. Bonus step: Handle duplicate user registration.