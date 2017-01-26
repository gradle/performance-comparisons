package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5955 {
    private final Productionnull_5955 production = new Productionnull_5955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}