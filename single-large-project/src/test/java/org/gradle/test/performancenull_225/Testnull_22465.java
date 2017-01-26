package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22465 {
    private final Productionnull_22465 production = new Productionnull_22465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}