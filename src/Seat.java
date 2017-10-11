public class Seat implements Comparable<Seat> {
	int x;
	int y;
	boolean available;
	
	
	public int compareTo(Seat seat) {
        if (this.y < seat.getY()) {
            return -1;
        }
        if (this.y > seat.getY()) {
            return 1;
        }
        return 0;
    }
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}


}
