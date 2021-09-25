package academy.learnprogramming;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            //compareTo 是 String 的 method
            //reference: https://www.w3schools.com/java/ref_string_compareto.asp
            //String casting reference: https://stackoverflow.com/questions/16815279/difference-between-casting-to-string-and-string-valueof
            return (((String)super.getValue()).compareTo((String)item.getValue()));
        } else {
            return -1;
        }
    }
}
