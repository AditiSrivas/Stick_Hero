# Stick_Hero
This readme provides an overview of the Stick Hero game application. The application has one package: `com.example.demo6`. The package contains classes that contribute to the overall functionality of the Stick Hero game.

 Class: Main
- Purpose: Launches the Stick Hero game by initializing the JavaFX application and loading the HomeScreen.fxml.
- Description: 
 Extends `javafx.application.Application`.
The `start` method sets up the primary stage, loads the `HomeScreen.fxml`, and displays it.

Class: SceneController
- Purpose: Controls the scenes and transitions between screens.
- Description:
 Manages the switching of scenes from the Home Screen to the Play Screen.
Handles events such as button clicks to switch between scenes.
Initializes the background image and sets it as the background of the scene.
 Defines a method (`switchToScene2`) to switch from the Home Screen to the Play Screen.

FXML: HomeScreen.fxml
- Purpose: Defines the layout and appearance of the Home Screen.
- Description:
 Contains an anchor pane with a background image, a "START" button, and a "STICK HERO" label.
The button is associated with the `switchToScene2` method in the `SceneController` class.

FXML: PlayScreen.fxml
- Purpose: Placeholder for the Play Screen UI.
- Description:
Currently empty as it seems to be a placeholder for the Play Screen.

Additional Notes
Image resources, such as "2256.jpg" and "stickman.png," are assumed to be located in the specified paths. Ensure that the paths are correct. 

Running the Application
1. Ensure that you have JavaFX properly installed.
2. Run the `Main` class in the `com.example.demo6` package to launch the Stick Hero game.

Design Pattern

The provided code doesn't strictly adhere to a specific design pattern. However, there are elements that resemble the Model-View-Controller (MVC) pattern, a commonly used architectural design pattern in JavaFX applications.

Here's a breakdown:

1. Model: The model represents the data and business logic of the application. In this case, it could include the game logic, such as handling the growth of the stick and managing pillars. However, the model is not explicitly defined, and the game logic is spread across different methods.

2. View (FXML Files and SceneController): The FXML files (`HomeScreen.fxml` and `PlayScreen.fxml`) define the visual representation of the application's user interface. The `SceneController` class manages the scenes and controls the transition between them. The FXML files act as the view components.

3. Controller (`SceneController` and `stickHero`): The controller is responsible for handling user input, updating the model, and updating the view. In this case, both `SceneController` and `stickHero` classes include logic related to user input and scene management. `SceneController` manages the switching of scenes, while `stickHero` handles game-related events.
