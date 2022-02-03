// Created by Romir Varshney

import java.util.Scanner;

public class Wordle {

public static void main(String[] args)
{
Scanner kbReader = new Scanner(System.in);
boolean check = false;
String word[] = new String[6];
String possibilities[] = {"Abuse",
"Adult",
"Agent",
"Anger",
// "Apple",
"Award",
// "Basis",
"Beach",
"Birth",
"Block",
// "Blood",
"Board",
"Brain",
"Bread",
"Break",
"Brown",
"Buyer",
"Cause",
"Chain",
"Chair",
"Chest",
"Chief",
"China",
"Claim",
// "Class",
"Coast",
"Court",
"Cover",
"Cream",
"Crime",
// "Cross",
"Crowd",
"Death",
"Depth",
"Doubt",
"Draft",
// "Dress",
"Drink",
"Drive",
"Earth",
// "Enemy",
"Entry",
// "Error",
"Event",
"Faith",
"Fault",
"Field",
"Fight",
"Final",
// "Floor",
"Focus",
"Force",
"Frame",
"Frank",
"Front",
"Fruit",
// "Glass",
"Grant",
// "Grass",
"Group",
"Guide",
"Heart",
// "Henry",
"Horse",
"Hotel",
"House",
"Image",
"Index",
"Input",
// "Issue",
// "Japan",
"Jones",
"Judge",
"Knife",
// "Laura",
"Layer",
// "Level",
// "Lewis",
"Light",
// "Limit",
"Lunch",
"March",
"Match",
"Metal",
"Model",
"Money",
"Month",
"Motor",
"Music",
"Night",
"Noise",
"Nurse",
// "Offer",
"Order",
"Other",
"Owner",
"Panel",
"Paper",
// "Peter",
"Phone",
// "Piece",
"Pitch",
"Plant",
"Plate",
"Point",
"Pound",
"Power",
// "Press",
"Price",
"Prize",
// "Proof",
// "Queen",
"Radio",
"Range",
"Ratio",
"Reply",
"Right",
"River",
"Round",
"Route",
"Rugby",
"Scale",
// "Scene",
"Scope",
"Score",
// "Sense",
"Shape",
"Share",
// "Sheep",
// "Sheet",
"Shift",
"Shirt",
"Shock",
"Sight",
"Simon",
// "Skill",
// "Sleep",
"Smile",
// "Smith",
"Smoke",
"Sound",
"South",
"Space",
// "Speed",
"Spite",
"Sport",
"Squad",
// "Staff",
"Stage",
// "Start",
// "State",
"Steam",
// "Steel",
"Stock",
"Stone",
"Store",
"Study",
// "Stuff",
"Style",
"Sugar",
"Table",
"Taste",
// "Terry",
"Theme",
"Thing",
// "Title",
// "Total",
"Touch",
"Tower",
"Track",
"Trade",
"Train",
"Trend",
"Trial",
// "Trust",
"Value",
"Video",
// "Visit",
"Water",
"While",
"White",
"Whole",
"Woman",
"World",
"Youth"};
String temp = "";
long random = Math.round(Math.random() * possibilities.length);
String wordle = possibilities[(int)random].toUpperCase();
String bank = "";
String waste = "";
String chart = "";
String correct = "";

for(int z = 0; z < 6; z++)
{
while(check == false)
{
System.out.print("Enter a 5 letter word " + (z + 1) + " / 6: ");
temp = kbReader.nextLine();
if (temp.length() == 5)
check = true;
}
check = false;
word[z] = temp.toUpperCase();
System.out.print(word[z] + "\t");
System.out.println();
System.out.println();
if(word[z].equalsIgnoreCase(wordle))
{
System.out.println("");
System.out.println("Congrats! You got the word in " + (z + 1) + " tries.");
System.out.println("");
System.out.println("Final Distribution");
System.out.println("");
System.out.print(chart += word[z] + "\n");
for(int m = 6 - z; m > 1; m--)
{
System.out.print("*****");
System.out.println();
}
System.exit(0);
}
for(int i = 0; i < 5; i++)
{
if(word[z].charAt(i) == wordle.charAt(i))
{
chart += word[z].charAt(i);
}
else if(wordle.contains(String.valueOf(word[z].charAt(i))))
{
bank += word[z].charAt(i);
chart += Character.toLowerCase(word[z].charAt(i));
}
else
{
waste += word[z].charAt(i);;
chart += "-";
}
}

bank = "";
chart += "\n";
System.out.print(chart);
for(int m = 6 - z; m > 1; m--)
{
System.out.print("*****");
System.out.println();
}
System.out.println("");
System.out.println("Lowercase letters means the letter is in the word, uppercase means the letter is in the right place.");
System.out.println("You have used the letters: " + remove(waste));
System.out.println("");
}
System.out.println("");
System.out.println("The word was " + wordle);
System.out.println("");
System.out.println("Final Distribution");
System.out.println("");
System.out.println(chart);
}
public static String remove(String bank) //, String chart)
{
String result = "";
String result2 = "";
for (int i = 0; i < bank.length(); i++)
{
       if(!result.contains(String.valueOf(bank.charAt(i))))
       {
           result += String.valueOf(bank.charAt(i));
       }
}
return result;
}
}