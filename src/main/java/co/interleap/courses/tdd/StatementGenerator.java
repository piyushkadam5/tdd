package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

    public Double create(List<Ride> rides){
        Double totFare = 0.0;
        for(Ride ride: rides) {
            totFare += ride.getFareForSingleRide();
        }
        return totFare;
    }
}
