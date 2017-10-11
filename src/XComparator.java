import java.util.Comparator;


public class XComparator implements Comparator<Seat> {

	public int compare(Seat seat, Seat outroSeat) {
		
		if (seat.getX() < outroSeat.getX()) {
            return -1;
        }
        if (seat.getX() > outroSeat.getX()) {
            return 1;
        }
        return 0;
	}
}
