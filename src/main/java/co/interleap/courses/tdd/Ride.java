package co.interleap.courses.tdd;

public class Ride {
    public static int FARE_PER_KM = 10;
    public static int FARE_PER_MINUTE = 1;

    Double distance;
    Double timeInMinutes;

    public Ride(Double distance, Double timeInMinutes) {
        this.distance = distance;
        this.timeInMinutes = timeInMinutes;
    }

    public Double getFareForSingleRide(){
        Double totalFare = ( FARE_PER_KM * distance ) + ( FARE_PER_MINUTE * timeInMinutes );
        return totalFare;
    }
}
