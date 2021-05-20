package controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.javalin.core.util.FileUtil;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class ReportController
{
    private static final Logger logger = LogManager.getLogger(ReportController.class);

    public void getAllProjects(@NotNull Context context)
    {
        logger.info("Extract all project names");
        logger.debug("Debug");


        context.contentType("application/json");
        context.json(new String[]{"TST","SIT","UAT"});
    }

    public void getRData(@NotNull Context context)
    {
        context.contentType("application/json");
        context.html(FileUtil.readFile(System.getProperty("user.dir")+"/src/main/java/template.html"));
    }

}
