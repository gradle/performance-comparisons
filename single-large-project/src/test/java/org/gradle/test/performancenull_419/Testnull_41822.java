package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41822 {
    private final Productionnull_41822 production = new Productionnull_41822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}