import controller.ReportController;
import io.javalin.Javalin;

public class Main {

    static final String REPORT = "/get-report";
    static final String PROJECTS = "/get-projects";

    public static void main(String[] args)
    {
        ReportController rc = new ReportController();

        Javalin app = Javalin.create(config ->
                        {
                        config.addStaticFiles("/public");
                        }).start(7071);

        app.get(PROJECTS, rc::getAllProjects);
        app.get(REPORT, rc::getRData);


    }

}


