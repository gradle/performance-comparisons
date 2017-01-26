package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34965 {
    private final Productionnull_34965 production = new Productionnull_34965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}