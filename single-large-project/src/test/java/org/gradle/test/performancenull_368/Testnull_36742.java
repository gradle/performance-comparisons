package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36742 {
    private final Productionnull_36742 production = new Productionnull_36742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}