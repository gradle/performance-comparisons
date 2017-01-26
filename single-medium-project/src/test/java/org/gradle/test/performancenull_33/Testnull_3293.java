package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3293 {
    private final Productionnull_3293 production = new Productionnull_3293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}