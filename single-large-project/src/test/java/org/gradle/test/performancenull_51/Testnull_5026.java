package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5026 {
    private final Productionnull_5026 production = new Productionnull_5026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}