package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23715 {
    private final Productionnull_23715 production = new Productionnull_23715("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}