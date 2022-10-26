public class App {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new IStrategyImpl1());
        context.appliquerStrategy();
        context.setStrategy(new IStrategyImpl2());
        context.appliquerStrategy();
        context.setStrategy(new IStrategyImpl3());
        context.appliquerStrategy();

    }
}
