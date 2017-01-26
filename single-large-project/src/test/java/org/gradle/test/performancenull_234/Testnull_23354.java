package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23354 {
    private final Productionnull_23354 production = new Productionnull_23354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}