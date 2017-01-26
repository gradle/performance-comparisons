package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31465 {
    private final Productionnull_31465 production = new Productionnull_31465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}