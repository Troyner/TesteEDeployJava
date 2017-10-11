import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Teste2 {

	public static void main(String[] args) {
		
		Teste teste = new Teste();
		
		System.out.println(teste.comecaComA("arroz"));

		List<Seat> seats = new ArrayList<Seat>();
		
		Seat seat = new Seat();
		
		seat.setX(5);
		seat.setY(2);
		
		Seat seat2 = new Seat();
		
		seat2.setX(2);
		seat2.setY(0);
		
		seats.add(seat);
		seats.add(seat2);
		
		Seat seat3 = new Seat();
		
		seat3.setX(4);
		seat3.setY(2);
		
		SeatMap seatMap = new SeatMap();
		
		seatMap.setSeats(new ArrayList<Seat>());
		seatMap.getSeats().add(seat);
		seatMap.getSeats().add(seat2);
		seatMap.getSeats().add(seat3);
		
		for (List<Seat> l : teste.ordenarSeat(seatMap)) {
			for (Seat s : l) {
				System.out.print(s.getX());
				System.out.println(s.getY());
			}
		}
		
	}

	

	
	
	
}
