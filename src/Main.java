import Iterator.BrowserHistory;
import Memento.Editor;
import Memento.History;
import Strategy.*;
import TemplateMethod.AuditTrail;
import TemplateMethod.GenerateReport;
import TemplateMethod.TransferMoneyTask;
import oops.*;

import java.util.GregorianCalendar;

public class Main {

    public void  oopsRun(){
//        class Example
        User a=new User("Bala");
        a.sasyHallow();

//       Interface example
        TaxCalculator calc =new Calc2023();
        calc.calcuylateTax();

//        Encapsulation Example
        Account acc1=new Account();
        acc1.setBalance(100);
        System.out.println("Balance"+acc1.getBalance());

//        Abstraction Example
        MailService service =new MailService();
        service.senEmail();

//        Inheritance
        var textbox=new TextBox();
        textbox.enable();

//        Polymorphism
        DrawUiControl(new TextBox());
        DrawUiControl(new CheckBox());

    }

    public static void DrawUiControl(UiControl control){
        control.draw();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Implementing OOPs
        Main a= new Main();
//      a.oopsRun();


//        Memento pattern
        var editor =new Editor();
        var history =new History();

        editor.setContent("a");

        history.push(editor.createState());
        editor.setContent("b");


        history.push(editor.createState());
        editor.setContent("c");

//        history.push(editor.createState());
        editor.restore(history.pop());
        System.out.println(editor.getContent());


//        State pattern


//        Iterator Pattern
        var his =new BrowserHistory();
        his.push("Arr");
        his.push("Bag");
        his.push("card");

        var hist =his.creatorIterator();
        while (hist.hasNext()){
            var url = hist.current();
            System.out.println(url);
            hist.next();
        }

//        Strategy Pattern
        var storage=new ImageStorage(new JpegCompressor(),new BWFilter());
        storage.store("dragon.jpg");

        var storage2= new ImageStorage();
        storage2.store("boo.png",new PngCompressor(),new VintageFilter());

// Template Pattern

        var audit =new AuditTrail();
        var send=new TransferMoneyTask(audit);
        var report=new GenerateReport(audit);

        send.execute();
        report.execute();




    }

}