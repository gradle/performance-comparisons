package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48098 {
    private final Productionnull_48098 production = new Productionnull_48098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}