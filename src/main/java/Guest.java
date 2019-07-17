public class Guest {

    private String name;
    private double money;

    public Guest(String name, double money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public void payMoney(Booking booking) {
        this.money -= booking.getTotal();
    }
}
