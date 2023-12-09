ReadMe for Stick Hero Game

This is a simple implementation of the Stick Hero game using JavaFX. The game involves extending a stick to bridge the gap between platforms and advance in the game.

Contents
1. Overview
2. Getting Started
3. Game Components
4. Game Logic
5. Pillar Generation
6. Start Screen

Overview
The Stick Hero game is implemented using JavaFX. The game consists of a stick that the player can extend to bridge the gap between platforms (pillars). The goal is to successfully bridge the gap and land on the next platform.

Getting Started
To run the game, you can use the provided `stickHero` class, which serves as the entry point for the application. The game starts with a welcome screen, and clicking the "PLAY" button will transition to the game screen.

Game Components
HelloController
- Manages the game screen using JavaFX.
- Handles user input for extending the stick and releasing to check for collisions.
- Uses a `Rectangle` for the stick and platform.

Pillar, PillarDistance, and PillarGenerator
- `Pillar` and `PillarDistance` are subclasses of `GameComponents`, representing different aspects of the pillars.
- `PillarGenerator` creates and manages the pillars in the game.

StartScreen
- Represents the initial screen with the game title and a "PLAY" button.
- Clicking the "PLAY" button transitions to the game screen.

Game Logic
The game logic is handled in the `HelloController` class, where the stick can be extended by pressing the space key. The game checks for collisions when the space key is released. The `PillarGenerator` class generates pillars with varying widths and distances between them.

Pillar Generation
Pillars are generated using the `PillarGenerator` class, which creates a list of rectangles representing the pillars. The width and distance between pillars are determined randomly.

Start Screen
The `StartScreen` class creates the initial screen with a background image, game title, and a "PLAY" button. Clicking the "PLAY" button transitions to the game screen.

Design Pattern


The provided code doesn't explicitly follow a well-defined design pattern, but it exhibits some principles of the Model-View-Controller (MVC) pattern, which is commonly used in GUI-based applications. Here's a breakdown:

1. Model: The classes `Pillar`, `PillarDistance`, and `PillarGenerator` can be considered part of the model. They represent the data (pillar attributes) and the logic for generating and managing pillars in the game.

2. View: The `HelloController` class, along with the associated FXML file, is responsible for managing the visual components of the game screen. It handles user input, updates the view (stick and platform), and contains the logic for collision detection.

3. Controller:The `StartScreen` class serves as the initial screen controller, handling the transition to the game screen. The `HelloController` class is the game screen controller, managing the interaction between the view and the model.


