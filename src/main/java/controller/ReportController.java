package controller;
import io.javalin.core.util.FileUtil;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class ReportController extends Commons
{
    public void getAllProjects(@NotNull Context context)
    {
        logger.info("Extract all project names");

        context.contentType("application/json");
        context.json(new String[]{"TST","SIT","UAT"});
    }

    public void getRData(@NotNull Context context)
    {
        logger.info("Calculate and extract report ");
        context.contentType("application/json");
        context.html(FileUtil.readFile(System.getProperty("user.dir") + "/src/main/java/template.html"));
    }

    public void getPTestData(@NotNull Context context)
    {
        logger.info("Extract Data from Ptest");
        String token =authenticatePTest();
        context.contentType("application/json");
        context.html(FileUtil.readFile(System.getProperty("user.dir") + "/src/main/java/template.html"));
    }

    private String authenticatePTest()
    {
        logger.info("Generating authentication token from P Test app");

        return "Bearer AT.asd8asd8asdasd8asdasdsa8dasdds4d5as4d54asd4asdas7da4s5d2sad4as4d75as4d5";

    }

}
