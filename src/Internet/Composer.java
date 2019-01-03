package Internet;

public interface Composer {
    public void Update(String key, String s);
    public void Set(String key, Composer c);
    public void Set(String key, String s);
    public void Set(String key, Integer i) throws Exception;
    public void Set(String s);
    public String GetValue();
}
