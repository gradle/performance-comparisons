package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37340 {
    private final Productionnull_37340 production = new Productionnull_37340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}