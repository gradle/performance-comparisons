package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32981 {
    private final Productionnull_32981 production = new Productionnull_32981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}