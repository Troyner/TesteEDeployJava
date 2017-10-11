import java.util.Comparator;


public class YComparator implements Comparator<Seat> {

	public int compare(Seat seat, Seat outroSeat) {
		
		if (seat.getY() < outroSeat.getY()) {
            return -1;
        }
        if (seat.getY() > outroSeat.getY()) {
            return 1;
        }
        return 0;
	}
}
