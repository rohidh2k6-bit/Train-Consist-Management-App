package test;

import main.UseCase8TrainConsistMgmt;
import main.UseCase8TrainConsistMgmt.Bogie;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilter() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(list);

        assertEquals(1, result.size());
    }
}