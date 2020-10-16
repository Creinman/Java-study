public class FromArchievedStatusMover extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus){
        if (book.getStatus().equals("ARCHIEVED")) { //(book.getStatusEnum() == StatusEnum requestedStatus)
            switch (requestedStatus){
                case BORROWED:
                    System.out.println("перевод в статус   " + requestedStatus + " невозможен");
                    break;
                case AVAILABLE:
                    System.out.println("перевод в статус  " + requestedStatus);
                    book.setStatus("AVAILABLE");
                    break;
                case OVERDUED:
                    System.out.println("перевод в статус " + requestedStatus + " невозможен");
                    break;
            }
        } else System.out.println("невозможно работа с " + book.getStatus());
    }
}