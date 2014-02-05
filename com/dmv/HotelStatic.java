package scjp;

/**
 *
 * @author dovailla
 */
public class HotelStatic {

    public static void book() {
        //some code goes here
    }

    public void cancelBooking() {
        book();
    }
    
    public static void main(String args[]) {
        HotelStatic h = new HotelStatic();
        
        h.cancelBooking();
    }

}


