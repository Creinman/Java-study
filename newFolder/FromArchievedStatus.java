public class FromArchievedStatusMover extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus){
        if (book.getStatus().equals("ARCHIEVED")) { //(book.getStatusEnum() == StatusEnum requestedStatus)
            switch (requestedStatus){
                case BORROWED:
                    System.out.println("������� � ������   " + requestedStatus + " ����������");
                    break;
                case AVAILABLE:
                    System.out.println("������� � ������  " + requestedStatus);
                    book.setStatus("AVAILABLE");
                    break;
                case OVERDUED:
                    System.out.println("������� � ������ " + requestedStatus + " ����������");
                    break;
            }
        } else System.out.println("���������� ������ � " + book.getStatus());
    }
}