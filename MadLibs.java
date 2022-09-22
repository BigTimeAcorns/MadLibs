/*
Madlib story
Cade Dannels,  Jake Gyberg
AP Computer Science A
9/22/2022
A Madlib program that can be used for any story outline
*/ 


import java.util.Scanner;
public class MadLibs{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Sory template
        String story = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";

        //Runs until there are no more blank spots
        while (story.contains("<")) {
            //find next blank
            int index1 = story.indexOf("<");
            int index2 = story.indexOf(">");

            //Prompt for user input
            System.out.println("Enter a(n) "+story.substring(index1+1, index2));

            //Gets user input and puts it in variable
            String answer = sc.nextLine();

            //Changes story string
            story = story.replaceFirst("<" + story.substring(index1+1, index2)+ ">", answer);

        }
        
        
        //Print completed story
        System.out.println(story);
        
        sc.close();
    }
}