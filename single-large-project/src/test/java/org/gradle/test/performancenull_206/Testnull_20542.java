package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20542 {
    private final Productionnull_20542 production = new Productionnull_20542("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}