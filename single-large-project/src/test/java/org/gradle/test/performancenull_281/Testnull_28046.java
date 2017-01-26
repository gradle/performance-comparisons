package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28046 {
    private final Productionnull_28046 production = new Productionnull_28046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}