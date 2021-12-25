package creational.builder;

public class Golfer {
    public static void main(String[] args) {
        Gentleman.Builder builder = new Gentleman.Builder();
        builder.setTopwear("T-shirt").setBottomwear("Linen Pants").setHeadwear("Golf cap").setFootwear("Shickers");
        Gentleman golfer = builder.build();

        System.out.println("Wearing topwer :: " + golfer.getTopwear());
        System.out.println("Wearing bottomwear :: " + golfer.getBottomwear());
        System.out.println("Wearing headwear :: " + golfer.getHeadwear());
        System.out.println("Wearing topwear :: " + golfer.getTopwear());
    }
}
