public class MultiPurposeCopier extends Copier implements Printer,Fax,Scanner{

    // コピー機の機能
    //public Paper copy(Paper origin)

    private Paper paper1;
    private Document document1;
    // スキャナの機能
    public Document scan(Paper document){
        paper1 = document;
        return 0;
    }

    // ファクシミリの機能
    public Paper receive(){
        return 0;
    }
    public void send(Paper document, String to){

    }

    // プリンタの機能
    public Paper print(Document document){
        document1 = document;
        return 0;
    }
}