package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40702 {
    private final Productionnull_40702 production = new Productionnull_40702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}