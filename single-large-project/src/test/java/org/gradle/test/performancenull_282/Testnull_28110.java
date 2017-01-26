package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28110 {
    private final Productionnull_28110 production = new Productionnull_28110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}