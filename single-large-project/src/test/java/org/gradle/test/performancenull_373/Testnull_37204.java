package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37204 {
    private final Productionnull_37204 production = new Productionnull_37204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}