package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_108 {
    private final Productionnull_108 production = new Productionnull_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}