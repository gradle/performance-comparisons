package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21442 {
    private final Productionnull_21442 production = new Productionnull_21442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}