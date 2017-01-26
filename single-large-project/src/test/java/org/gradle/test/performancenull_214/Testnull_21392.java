package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21392 {
    private final Productionnull_21392 production = new Productionnull_21392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}