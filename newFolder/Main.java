class Main {
    public static void main(String[] args) {
        Book book = new Book("MyBook from your library", "AVAILABLE");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIEVED);
        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);

        System.out.println("Current Status: " + book.getStatus());
    }
}