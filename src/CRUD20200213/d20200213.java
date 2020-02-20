package CRUD20200213;

public interface d20200213 {
	public void writeFile(String title, String content);
	public String readFile(String title);
	public void appendFile(String title, String content);
	public boolean deleteFile(String title);

}
