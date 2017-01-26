package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23288 {
    private final Productionnull_23288 production = new Productionnull_23288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}