package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34927 {
    private final Productionnull_34927 production = new Productionnull_34927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}