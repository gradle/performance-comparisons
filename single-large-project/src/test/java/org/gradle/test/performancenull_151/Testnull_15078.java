package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15078 {
    private final Productionnull_15078 production = new Productionnull_15078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}