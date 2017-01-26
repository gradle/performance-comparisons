package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7465 {
    private final Productionnull_7465 production = new Productionnull_7465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}