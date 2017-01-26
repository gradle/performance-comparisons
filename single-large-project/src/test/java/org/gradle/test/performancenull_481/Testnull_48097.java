package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48097 {
    private final Productionnull_48097 production = new Productionnull_48097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}