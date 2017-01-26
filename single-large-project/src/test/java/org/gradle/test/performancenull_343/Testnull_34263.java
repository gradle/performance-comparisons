package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34263 {
    private final Productionnull_34263 production = new Productionnull_34263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}