package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26097 {
    private final Productionnull_26097 production = new Productionnull_26097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}