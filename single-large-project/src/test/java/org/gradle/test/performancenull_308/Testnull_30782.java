package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30782 {
    private final Productionnull_30782 production = new Productionnull_30782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}