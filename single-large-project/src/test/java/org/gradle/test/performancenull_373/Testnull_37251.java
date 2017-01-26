package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37251 {
    private final Productionnull_37251 production = new Productionnull_37251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}