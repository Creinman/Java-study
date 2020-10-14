public class Book {
    public String title;
    public String status;

    public Book(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String requestedStatus){
        this.status = requestedStatus;
    }
}