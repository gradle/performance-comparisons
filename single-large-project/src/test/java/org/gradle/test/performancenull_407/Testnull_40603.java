package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40603 {
    private final Productionnull_40603 production = new Productionnull_40603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}