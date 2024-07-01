public class App {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String root = "https://youtube.com";

        crawler.discoverWeb(root);
    }
}