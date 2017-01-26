package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5135 {
    private final Productionnull_5135 production = new Productionnull_5135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}