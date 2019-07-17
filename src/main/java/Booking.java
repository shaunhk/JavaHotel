public class Booking {

    private int nightsBooked;
    private Bedroom bedroom;
    private Guest guest;
    private double total;

    public Booking(int nightsBooked, Bedroom bedroom, Guest guest){
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
        this.guest = guest;
        this.total = nightsBooked * bedroom.getPrice();
    }


    public Bedroom getRoom() {
        return this.bedroom;
    }

    public Guest getGuest(){
        return this.guest;
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public double getTotal() {
        return this.total;
    }

}
