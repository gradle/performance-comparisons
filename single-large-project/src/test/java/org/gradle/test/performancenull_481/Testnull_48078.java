package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48078 {
    private final Productionnull_48078 production = new Productionnull_48078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}