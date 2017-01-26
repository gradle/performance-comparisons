package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34298 {
    private final Productionnull_34298 production = new Productionnull_34298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}