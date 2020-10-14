public class FromAvailableStatusMover extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
      if (book.getStatus().equals("AVAILABLE")) {
        switch (requestedStatus) {
            case BORROWED:
                System.out.println("������� � ������   " + requestedStatus);
                book.setStatus("BORROWED");
                break;
            case ARCHIEVED:
                System.out.println("������� � ������  " + requestedStatus);
                book.setStatus("ARCHIEVED");
                break;
            case OVERDUED:
                System.out.println("������� � ������ " + requestedStatus + " ����������");
                break;
        }
    }
}
}