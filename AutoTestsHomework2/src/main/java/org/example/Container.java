package org.example;

import java.util.ArrayList;
import java.util.List;

public class Container implements MyUnit{
    public List<MyUnit> unitList = new ArrayList<>();

    @Override
    public void add(MyUnit unit) {
    unitList.add(unit);
    }

    @Override
    public void remove(MyUnit unit) {
    unitList.remove(unit);
    }

    @Override
    public String print() {
        StringBuilder result = new StringBuilder();
        unitList.forEach(u->result.append(u.print()));
    return result.toString();
    }
}
