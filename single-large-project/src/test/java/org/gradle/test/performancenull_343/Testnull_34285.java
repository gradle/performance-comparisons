package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34285 {
    private final Productionnull_34285 production = new Productionnull_34285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}