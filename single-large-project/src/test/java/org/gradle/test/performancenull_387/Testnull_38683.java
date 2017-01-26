package org.gradle.test.performancenull_387;

import static org.junit.Assert.*;

public class Testnull_38683 {
    private final Productionnull_38683 production = new Productionnull_38683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}