package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37381 {
    private final Productionnull_37381 production = new Productionnull_37381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}