package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3248 {
    private final Productionnull_3248 production = new Productionnull_3248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}