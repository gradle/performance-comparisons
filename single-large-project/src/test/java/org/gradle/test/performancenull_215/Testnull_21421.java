package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21421 {
    private final Productionnull_21421 production = new Productionnull_21421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}