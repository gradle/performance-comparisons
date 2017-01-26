package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34246 {
    private final Productionnull_34246 production = new Productionnull_34246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}