package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1993 {
    private final Productionnull_1993 production = new Productionnull_1993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}