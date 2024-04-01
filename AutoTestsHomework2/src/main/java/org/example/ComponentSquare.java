package org.example;

public class ComponentSquare extends Component{
    @Override
    public String print() {
        String result = "I'm square.\n";
        System.out.println(result);
        return result;
    }
}
