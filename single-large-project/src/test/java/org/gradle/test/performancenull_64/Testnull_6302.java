package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6302 {
    private final Productionnull_6302 production = new Productionnull_6302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}