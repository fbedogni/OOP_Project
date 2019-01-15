package rest;

public enum Table {
	users("users"),
	bevande("bevande"),
	primi("primi"),
	secondi("secondi"),
	dessert("dessert"),
	vini("vini"),
	liquori("liquori"),
	tavoli("tavoli"),
    upload("upload"),
    connect("connect"),
    prodotti("prodotti"),
	ordini("ordini");

    private String table;

    Table(String table) {
        this.table = table;
    }

    public String GetTable() {
        return this.table;
    }
}
