package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24622 {
    private final Productionnull_24622 production = new Productionnull_24622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}