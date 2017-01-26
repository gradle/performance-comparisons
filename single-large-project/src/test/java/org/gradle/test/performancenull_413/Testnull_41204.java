package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41204 {
    private final Productionnull_41204 production = new Productionnull_41204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}