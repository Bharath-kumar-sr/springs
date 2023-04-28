package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tickets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookingid;
	String customername;
	String moviename;
	String seatnumber;
	int ticketprice;
	int ticketscount;

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}

	public double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}

	public int getTicketscount() {
		return ticketscount;
	}

	public void setTicketscount(int ticketscount) {
		this.ticketscount = ticketscount;
	}

	@Override
	public String toString() {
		return "Tickets [bookingid=" + bookingid + ", customername=" + customername + ", moviename=" + moviename
				+ ", seatnumber=" + seatnumber + ", ticketprice=" + ticketprice + ", ticketscount=" + ticketscount
				+ "]";
	}

}
