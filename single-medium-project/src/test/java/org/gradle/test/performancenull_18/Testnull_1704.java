package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1704 {
    private final Productionnull_1704 production = new Productionnull_1704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}