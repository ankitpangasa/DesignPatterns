package structural.bridge;

public class HTMLFormatter implements  Formatter{

    @Override
    public String print(Item item) {
        StringBuilder builder = new StringBuilder();
        builder.append("Classification : " + item.getClassification() + "\n" + "<br />" + "\n");
        builder.append("Details:" + "\n");
        builder.append("<table>" + "\n");
        for(Object key: item.getDetails().keySet()){
            builder.append("<tr>" + "\n");
            builder.append("<td>" + key + "</td>" + "<td>" +  item.getDetails().get(key) + "</td>" + "\n");
            builder.append("</tr>" + "\n");
        }
        builder.append("</table>");
        return builder.toString();
    }
}
