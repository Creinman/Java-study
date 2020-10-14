public class FromBorrowedStatusMover extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
      if (book.getStatus().equals("BORROWED")) {
        switch (requestedStatus) {
            case AVAILABLE:
                System.out.println("перевод в статус   " + requestedStatus);
                book.setStatus("AVAILABLE");
                break;
            case ARCHIEVED:
                System.out.println("перевод в статус  " + requestedStatus);
                book.setStatus("ARCHIEVED");
                break;
            case OVERDUED:
                System.out.println("перевод в статус " + requestedStatus);
                book.setStatus("OVERDUED");
                break;
        }
      }
    }
}