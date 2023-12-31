package isp.lab8.airways;
import examples.files.FilesAndFoldersUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class AirwaysTest {
    @Test
    public void test() throws IOException {
        Route route1 = new Route("LRCL-LROP");
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(route1.getPath() + "\\..");
        assertEquals(1, files.size());
        Waypoint way = new Waypoint("LRCL", "Cluj-Napoca International Airport", 46.7712, 23.6236, 415);
        route1.addWaypoint(way);
        Waypoint way2 = new Waypoint("TASOD", "Tasnad VOR/DME", 44.4268, 26.1025, 10460);
        route1.addWaypoint(way2);
        files = FilesAndFoldersUtil.getFilesInFolder(route1.getPath());
        assertEquals(2, files.size());
        assertEquals(324, (int)route1.getTotalDistance());

        Route route2 = new Route("LRCL-LROO");
        Route.removeRoute(route1);
        files = FilesAndFoldersUtil.getFilesInFolder(route2.getPath() + "\\..");
        assertEquals(1, files.size());
    }
}
