package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41255 {
    private final Productionnull_41255 production = new Productionnull_41255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}