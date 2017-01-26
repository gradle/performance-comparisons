package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17954 {
    private final Productionnull_17954 production = new Productionnull_17954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}