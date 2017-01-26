package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37230 {
    private final Productionnull_37230 production = new Productionnull_37230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}