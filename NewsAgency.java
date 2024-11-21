import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String newsContent;

    @Override
    public void attach(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(newsContent);
        }
    }

    public void publishNews(String news) {
        this.newsContent = news;
        System.out.println("\n" + "News published " + news + "\n");
        notifyObservers();  
    }
}
