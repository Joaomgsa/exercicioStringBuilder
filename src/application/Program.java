package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("WOW thats awesome");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("May the force br with you");

        Post p2 = new Post(sdf.parse("28/07/2018 33:05:44"),
                "Good night guys",
                "See you tomorrow",
                12);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}