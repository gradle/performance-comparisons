package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18578 {
    private final Productionnull_18578 production = new Productionnull_18578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}