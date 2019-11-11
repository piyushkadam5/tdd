package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class StatementTest {

    @Test
    public void generateStatementForAJourneyGivenTotalDistance(){
        Statement stmt =new Statement(Collections.singletonList(new Ride(15.0, 0.0)));
        assertEquals(1,stmt.getTotalNoOfRides());
        assertEquals(150.0,stmt.getTotalFare());
        assertEquals(150.0,stmt.getAvgFarePerRide());
    }

    @Test
    public void generateStatementForAJourneyGivenTotalDistanceAndTime(){
        Statement stmt =new Statement(Collections.singletonList(new Ride(10.0, 4.0)));
        assertEquals(1,stmt.getTotalNoOfRides());
        assertEquals(104.0,stmt.getTotalFare());
        assertEquals(104.0,stmt.getAvgFarePerRide());
    }

}
