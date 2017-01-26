package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37295 {
    private final Productionnull_37295 production = new Productionnull_37295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}