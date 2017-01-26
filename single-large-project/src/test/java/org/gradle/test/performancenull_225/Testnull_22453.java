package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22453 {
    private final Productionnull_22453 production = new Productionnull_22453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}