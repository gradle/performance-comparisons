package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48091 {
    private final Productionnull_48091 production = new Productionnull_48091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}