package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33579 {
    private final Productionnull_33579 production = new Productionnull_33579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}