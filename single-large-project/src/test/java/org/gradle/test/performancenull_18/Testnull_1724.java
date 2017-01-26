package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1724 {
    private final Productionnull_1724 production = new Productionnull_1724("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}