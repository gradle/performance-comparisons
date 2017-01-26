package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5480 {
    private final Productionnull_5480 production = new Productionnull_5480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}