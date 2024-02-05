# Smart Tracker App

This project is a demonstration of the Smart Tracker application, which allows users to track devices, their locations, and associated activities.

## Features

- **Create a Post:** Create a new post with associated user, location, and activities.
- **Get All:** Retrieve a list of all posts in the system.
-  **Update a Post :** If you want to update a post but you need the whole json snippet that was added.
-   **Delete a  Post** you delete a post.

  

### Prerequisites*

- Java (version 21)
- Spring Boot (version 3)
- Git
- Gradle
- IntelliJ
- Insomnia
- mySql.

### About the entities
This project has five entities.
Device entity
Has a One-to-One relationship with the User entity 
Has a One-to-Many relationship with the Location

Has a One-to-Many relationship with the Activity
User entity
Has a One-to-One relationship with the Device entity
Location Entity
Has a Many-to-One relationship with the Device entity 
Activity Entity
Has a Many-to-One relationship with the Device entity  implying that multiple activities can be associated with a single device.
Has a Many-to-One relationship with the Category entity indicating that multiple activities can belong to a single category.

## How i can use this project
The idea of the project was to build a Rest API that track your data. You made an activity and you want to store it somewhere.
This app helps to solve this problem. For example you made an activity of type programming.
You can add as json snippet with the help of Insomnia
## DeviceName: "My Computer"
## "user"      "username": "JavaDeveloper"
## "locations"  "location" "Uni Library"
## "activities" "startTime": "2024-01-24-18:04"
##            "endTime":   "2024-01-24-19:22"
## "category"  "categoryName": "programming" 
you can add multiple activities and locations.

This was a short description. For more details I hope we will discuss the project on the presentation day.


# If you want to run it in your machine
## Prerequisites*
git clone https://github.com/HarbinMustafaa/Tracker-API.git
git pull.


