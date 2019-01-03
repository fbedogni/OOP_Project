package Internet;

public interface Parser {
    public Parser GetParser(String key) throws Exception;
    public String GetString(String key);
    public Integer GetInt(String key) throws Exception;
    public String GetValue();
}
