public class SeatComparable implements Comparable<Seat> {
         
    private int y;
    // outros metodos e atributos
 
    public int compareTo(Seat seat) {
        if (this.y < seat.getY()) {
            return -1;
        }
        if (this.y > seat.getY()) {
            return 1;
        }
        return 0;
    }

}
