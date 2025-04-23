public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int length = name.length();
        if (length < 3 || length > 19) return false;

        int spaceIndex = name.indexOf(' ');
        if (spaceIndex == -1 || spaceIndex != name.lastIndexOf(' ')) return false;

        if (spaceIndex == 0 || spaceIndex == length - 1) return false;
        return true;
    }
}