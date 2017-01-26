package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34277 {
    private final Productionnull_34277 production = new Productionnull_34277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}