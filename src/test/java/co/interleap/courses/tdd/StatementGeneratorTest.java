package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StatementGeneratorTest {

    @Test
    public void shouldCalculateTotalFareGivenAnArrayOfDistanceAndTime(){
        List<Ride> rides = new ArrayList<Ride>();
        rides.add(new Ride(1.0,1.0));
        rides.add(new Ride(2.0,2.0));
        rides.add(new Ride(3.0,3.0));
        assertEquals(66.0,new StatementGenerator().create(rides));
    }

    @Test
    public void generateStatementForAJourneyGivenTotalDistance(){
        StatementGenerator generator = new StatementGenerator();
        Double totalFare = generator.create(Collections.singletonList(new Ride(15.0, 0.0)));
        assertEquals(150.0, totalFare);
    }
    @Test
    public void generateStatementForAJourneyGivenTotalDistanceAndTime(){
        StatementGenerator generator = new StatementGenerator();
        Double totalFare = generator.create(Collections.singletonList(new Ride(10.0, 4.0)));
        assertEquals(104.0, totalFare);
    }
}
