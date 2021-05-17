import io.javalin.core.util.FileUtil;

import java.io.File;

public class TestData {

        public static String getContent(){

            return FileUtil.readFile(System.getProperty("user.dir")+"/src/main/java/template.html");
        }
}
