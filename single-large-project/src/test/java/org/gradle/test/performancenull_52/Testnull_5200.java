package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5200 {
    private final Productionnull_5200 production = new Productionnull_5200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}