package Composicao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow! That's awesome!");

        Post p1 = new Post((sdf.parse("21/5/2025 23:30:30" )),"Traveling to Brazil",
                "I'm going to visit this Beautiful country!", 15 );
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);
        Post p2 = new Post((sdf.parse("21/5/2025 23:48:30" )),"Going to sleep",
                "Good night guys, see you tomorrow!", 30 );
        Comment c3 = new Comment("Good night man!");
        Comment c4 = new Comment("Me too, have a good night.");
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
