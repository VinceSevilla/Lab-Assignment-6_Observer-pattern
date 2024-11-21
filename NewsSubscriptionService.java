public class NewsSubscriptionService {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        
        Subscriber bins = new Subscriber("Bins");
        Subscriber arn = new Subscriber("Arn");
        Subscriber sev = new Subscriber("Sev");

        agency.attach(bins);
        agency.attach(arn);
        agency.attach(sev);

        agency.publishNews("\n" + "Breaking News: Minor floods in the city!");

        agency.detach(arn);

        agency.publishNews("\n" + "Breaking News: New dog breed!");
    }
}
