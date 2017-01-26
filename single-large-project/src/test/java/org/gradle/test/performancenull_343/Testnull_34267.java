package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34267 {
    private final Productionnull_34267 production = new Productionnull_34267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}