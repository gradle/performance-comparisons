package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37244 {
    private final Productionnull_37244 production = new Productionnull_37244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}