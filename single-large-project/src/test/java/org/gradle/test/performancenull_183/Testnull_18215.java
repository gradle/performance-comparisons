package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18215 {
    private final Productionnull_18215 production = new Productionnull_18215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}