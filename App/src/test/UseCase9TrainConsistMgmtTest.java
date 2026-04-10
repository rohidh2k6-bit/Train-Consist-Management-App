package test;

import main.UseCase9TrainConsistMgmt;
import main.UseCase9TrainConsistMgmt.Bogie;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UseCase9TrainConsistMgmtTest {

    @Test
    void testGrouping() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72)
        );

        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogies(list);

        assertEquals(2, result.get("Sleeper").size());
    }
}