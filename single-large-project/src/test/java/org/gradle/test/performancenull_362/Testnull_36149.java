package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36149 {
    private final Productionnull_36149 production = new Productionnull_36149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}