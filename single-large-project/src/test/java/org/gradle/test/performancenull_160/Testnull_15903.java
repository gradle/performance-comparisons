package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15903 {
    private final Productionnull_15903 production = new Productionnull_15903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}