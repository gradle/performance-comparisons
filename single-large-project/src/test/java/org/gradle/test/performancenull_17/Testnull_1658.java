package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1658 {
    private final Productionnull_1658 production = new Productionnull_1658("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}