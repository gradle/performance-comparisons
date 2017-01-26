package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3241 {
    private final Productionnull_3241 production = new Productionnull_3241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}