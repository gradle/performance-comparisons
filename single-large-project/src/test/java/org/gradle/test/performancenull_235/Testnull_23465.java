package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23465 {
    private final Productionnull_23465 production = new Productionnull_23465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}