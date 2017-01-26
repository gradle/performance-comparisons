package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34491 {
    private final Productionnull_34491 production = new Productionnull_34491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}