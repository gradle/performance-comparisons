package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34284 {
    private final Productionnull_34284 production = new Productionnull_34284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}