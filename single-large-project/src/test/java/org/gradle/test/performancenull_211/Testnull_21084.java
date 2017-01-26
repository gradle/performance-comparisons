package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21084 {
    private final Productionnull_21084 production = new Productionnull_21084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}