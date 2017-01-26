package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40180 {
    private final Productionnull_40180 production = new Productionnull_40180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}