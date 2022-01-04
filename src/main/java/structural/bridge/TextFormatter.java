package structural.bridge;

public class TextFormatter implements  Formatter{

    @Override
    public String print(Item item) {
        StringBuilder builder = new StringBuilder();
        builder.append("Classification : " + item.getClassification() + "\n");
        builder.append("Details:" + "\n");
        for(Object key: item.getDetails().keySet()){
            builder.append(key + " : " +  item.getDetails().get(key) + "\n");
        }
        return builder.toString();
    }
}
