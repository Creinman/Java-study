public enum StatusEnum {
    AVAILABLE("��������"),
    BORROWED("����� � �����������"),
    ARCHIEVED("� ������"),
    OVERDUED("���������")

    private String description;
private int property2;

StatusEnum(String description) {
	this.description=description;
}
}