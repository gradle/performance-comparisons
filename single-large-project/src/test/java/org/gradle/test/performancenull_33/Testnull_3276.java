package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3276 {
    private final Productionnull_3276 production = new Productionnull_3276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}