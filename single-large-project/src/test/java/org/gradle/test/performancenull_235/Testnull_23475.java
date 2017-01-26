package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23475 {
    private final Productionnull_23475 production = new Productionnull_23475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}