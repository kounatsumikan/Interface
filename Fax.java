public interface Fax {
    //ファクシミリの機能
    public abstract Paper receive();
    public abstract void send(paper document,String to);
}