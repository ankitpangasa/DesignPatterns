package creational.builder;

public class Gentleman {
    public static class Builder{
        private String topwear;
        private String bottomwear;
        private String footwear;
        private String headwear;

        public Builder(){}

        public Gentleman build(){
            return new Gentleman(this);
        }

        public Builder setTopwear(String topwear) {
            this.topwear = topwear;
            return this;
        }

        public Builder setBottomwear(String bottomwear) {
            this.bottomwear = bottomwear;
            return this;
        }

        public Builder setFootwear(String footwear) {
            this.footwear = footwear;
            return this;
        }

        public Builder setHeadwear(String headwear) {
            this.headwear = headwear;
            return this;
        }
    }

    public String getTopwear() {
        return topwear;
    }

    public String getBottomwear() {
        return bottomwear;
    }

    public String getFootwear() {
        return footwear;
    }

    public String getHeadwear() {
        return headwear;
    }

    private final String topwear;
    private final String bottomwear;
    private final String footwear;
    private final String headwear;

    public Gentleman(Builder builder) {
        this.topwear = builder.topwear;
        this.bottomwear = builder.bottomwear;
        this.footwear = builder.footwear;
        this.headwear = builder.headwear;
    }
}
