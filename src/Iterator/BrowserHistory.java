package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex= urls.size() -1;
        var lastUrl=urls.getLast();
        urls.remove(lastUrl);

        return  lastUrl;
    }

    public  Iterator creatorIterator(){
        return  new ListIterator(this);
    }

    public  class  ListIterator implements Iterator{

        private final BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory his){
            this.history=his;
        }

        @Override
        public boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public Object current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }



}
