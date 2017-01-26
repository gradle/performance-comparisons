package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18207 {
    private final Productionnull_18207 production = new Productionnull_18207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}