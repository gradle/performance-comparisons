package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26983 {
    private final Productionnull_26983 production = new Productionnull_26983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}