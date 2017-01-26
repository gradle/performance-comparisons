package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3221 {
    private final Productionnull_3221 production = new Productionnull_3221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}