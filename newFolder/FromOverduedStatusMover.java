public class FromOverduedStatusMover {
    public void moveToStatus(Book book, Status requestedStatus) {
      if (book.getStatus().equals("OVERDUED")) {
        switch (requestedStatus) {
            case AVAILABLE:
                System.out.println("перевод в статус   " + requestedStatus);
                book.setStatus("AVAILABLE");
                break;
            case ARCHIEVED:
                System.out.println("перевод в статус  " + requestedStatus);
                book.setStatus("ARCHIEVED");
                break;
            case BORROWED:
                System.out.println("перевод в статус " + requestedStatus + " невозможен");
                break;
        }
    }
}
}