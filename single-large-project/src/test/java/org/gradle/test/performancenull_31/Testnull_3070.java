package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3070 {
    private final Productionnull_3070 production = new Productionnull_3070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}