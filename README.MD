
# Assignment 4 - Facade Pattern

## Project Description

This Java project demonstrates the Facade design pattern
using a Home Theater system.

The HomeTheaterFacade class provides a simple interface
for controlling multiple devices.

## Components

- Projector - controls video projection.
- Amplifier - controls audio volume.
- StreamingPlayer - plays and stops movies.
- HomeTheaterFacade - coordinates all devices.
- Main - demonstrates how to use the Facade.

## Technologies

- Java 17
- IntelliJ IDEA
- JUnit 5

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure JDK 17.
3. Open Main.java.
4. Run the main() method.

## Example

HomeTheaterFacade theater = new HomeTheaterFacade();

theater.watchMovie("Interstellar");
theater.endMovie();

## Testing

JUnit 5 tests check:
- Successful movie startup
- Empty movie name handling
- Null movie name handling

## Design Pattern

The Facade pattern simplifies interaction with a
complex subsystem through a single interface.
