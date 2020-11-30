package test;

import com.ftpix.sparknnotation.Sparknotation;
import spark.Spark;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        Spark.get("/default", (req, res) -> {
            System.out.println("default spark halt");
            Spark.halt(401, "woops");
            return "uoo";
        });

        Sparknotation.init();
    }
}
