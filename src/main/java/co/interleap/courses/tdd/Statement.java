package co.interleap.courses.tdd;

import java.util.List;

public class Statement {

    private List<Ride> rides;

    public Statement(List<Ride> rides) {
        this.rides = rides;
    }

    public int getTotalNoOfRides() {
        return this.rides.size();
    }

    public Double getTotalFare() {
        Double totalFare = 0.0;
        for(Ride ride: rides) {
            totalFare += ride.getFareForSingleRide();
        }
        return totalFare;
    }

    public Double getAvgFarePerRide() {
        return getTotalFare()/getTotalNoOfRides();
    }
}
