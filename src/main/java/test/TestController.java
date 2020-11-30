package test;


import com.ftpix.sparknnotation.annotations.SparkController;
import com.ftpix.sparknnotation.annotations.SparkGet;
import spark.Spark;

@SparkController("/sparknotation")
public class TestController {

    @SparkGet
    public String test() {
        System.out.println("Halt with spark notation");
        Spark.halt(401, "woops");

        return "yo";
    }
}
