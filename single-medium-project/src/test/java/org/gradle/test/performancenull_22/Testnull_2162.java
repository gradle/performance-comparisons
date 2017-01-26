package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2162 {
    private final Productionnull_2162 production = new Productionnull_2162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}