package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48068 {
    private final Productionnull_48068 production = new Productionnull_48068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}