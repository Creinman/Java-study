public enum StatusEnum {
    AVAILABLE("доступно"),
    BORROWED("взято в пользование"),
    ARCHIEVED("в архиве"),
    OVERDUED("задержано")

    private String description;
private int property2;

StatusEnum(String description) {
	this.description=description;
}
}