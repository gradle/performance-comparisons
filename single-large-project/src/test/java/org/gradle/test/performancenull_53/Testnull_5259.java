package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5259 {
    private final Productionnull_5259 production = new Productionnull_5259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}