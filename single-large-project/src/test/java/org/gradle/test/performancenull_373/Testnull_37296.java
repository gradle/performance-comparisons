package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37296 {
    private final Productionnull_37296 production = new Productionnull_37296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}