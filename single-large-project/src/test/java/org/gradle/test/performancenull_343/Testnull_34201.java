package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34201 {
    private final Productionnull_34201 production = new Productionnull_34201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}