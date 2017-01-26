package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40171 {
    private final Productionnull_40171 production = new Productionnull_40171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}