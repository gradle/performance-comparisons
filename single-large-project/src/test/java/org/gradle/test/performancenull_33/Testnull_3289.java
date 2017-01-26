package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3289 {
    private final Productionnull_3289 production = new Productionnull_3289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}