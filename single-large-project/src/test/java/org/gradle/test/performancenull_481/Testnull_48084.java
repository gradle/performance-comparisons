package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48084 {
    private final Productionnull_48084 production = new Productionnull_48084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}