package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34266 {
    private final Productionnull_34266 production = new Productionnull_34266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}