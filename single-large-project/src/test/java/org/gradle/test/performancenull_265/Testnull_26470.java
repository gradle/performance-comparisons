package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26470 {
    private final Productionnull_26470 production = new Productionnull_26470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}