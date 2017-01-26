package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37985 {
    private final Productionnull_37985 production = new Productionnull_37985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}