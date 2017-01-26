package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3476 {
    private final Productionnull_3476 production = new Productionnull_3476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}