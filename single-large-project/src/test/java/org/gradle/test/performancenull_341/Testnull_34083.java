package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34083 {
    private final Productionnull_34083 production = new Productionnull_34083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}