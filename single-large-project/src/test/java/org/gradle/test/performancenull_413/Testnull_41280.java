package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41280 {
    private final Productionnull_41280 production = new Productionnull_41280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}