package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1108 {
    private final Productionnull_1108 production = new Productionnull_1108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}