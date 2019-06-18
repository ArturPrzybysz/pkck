package pkck;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProjectPaths {
    private static Path outDir = Paths.get("out");
    private static Path dataDir = Paths.get("data");
    public static Path xmlFile = dataDir.resolve("file.xml");
    public static Path schemaFile = dataDir.resolve("main.xsd");

}
