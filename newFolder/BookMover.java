public class BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {

        System.out.println("requested status... " + requestedStatus + "Mooving Status... " + book.status);
    }
}