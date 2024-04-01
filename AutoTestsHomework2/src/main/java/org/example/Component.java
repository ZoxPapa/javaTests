package org.example;

public abstract class Component implements MyUnit {
    @Override
    public void add(MyUnit unit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MyUnit unit) {
        throw new UnsupportedOperationException();
    }

}
