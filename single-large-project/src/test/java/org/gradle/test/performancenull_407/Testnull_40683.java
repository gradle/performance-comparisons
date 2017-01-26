package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40683 {
    private final Productionnull_40683 production = new Productionnull_40683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}