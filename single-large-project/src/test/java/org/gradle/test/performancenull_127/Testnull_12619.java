package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12619 {
    private final Productionnull_12619 production = new Productionnull_12619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}