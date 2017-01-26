package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11091 {
    private final Productionnull_11091 production = new Productionnull_11091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}