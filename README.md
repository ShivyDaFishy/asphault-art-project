# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an basketball scout, <br> 
> I want to analyze the stats of the 2023 - 2024 playoffs, <br> 
> so that I can determine the best overall scorer to draft to our team. 

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Example: 

Dataset: https://www.kaggle.com/datasets/mohamedsaqibshouqi/2023-2024-nba-player-stats-playoffs
- **Name** (String) - name of the player 
- **True Shooting Percentage** (double) - A measure of shooting efficiency that looks at 3 pts, field goals, etc.
- **Points Per Game** (double) - The players' average points per game 

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project](nameOfImageFileHere.png) 

## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

We first created a player class for each player that stores their info in instance variables. We then used a parameterized constructor to assign these values. After that, we used getter methods to get the info. We then used a toString method to return this info about the player. We then created a new player with the information stored in the 1D array. After that, we took that info from the array and created a new list which containted all the info. We then traversed that list and created the player based upon the index's. After that, we created a method which calculated the best overall scorer. After that, another method creates a variable called total points, which is by default the first player on the list. After traversing the list, if the players points and shooting percentage is greater than the first person on the listed, they replace this player. This continues until the full list is traversed. Ultimately bringing us our greatest scorer. Finally, we return the greatest scorer in our toString method.
