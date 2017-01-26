package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34241 {
    private final Productionnull_34241 production = new Productionnull_34241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}