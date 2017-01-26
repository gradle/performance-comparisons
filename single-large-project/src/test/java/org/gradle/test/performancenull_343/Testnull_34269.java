package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34269 {
    private final Productionnull_34269 production = new Productionnull_34269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}