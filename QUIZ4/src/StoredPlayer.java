public class StoredPlayer {
    public String key;
    public Player value;
    public StoredPlayer next;

    public StoredPlayer(String key, Player value) {
        this.key = key;
        this.value = value;
    }
}
