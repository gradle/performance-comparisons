package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1769 {
    private final Productionnull_1769 production = new Productionnull_1769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}