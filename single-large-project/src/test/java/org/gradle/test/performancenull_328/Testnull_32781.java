package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32781 {
    private final Productionnull_32781 production = new Productionnull_32781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}