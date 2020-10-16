public enum StatusEnum {
    AVAILABLE("available"),
    BORROWED("borrowed"),
    ARCHIEVED("archived"),
    OVERDUED("overdued")

    private String description;
private int property2;

StatusEnum(String description) {
	this.description=description;
}
}