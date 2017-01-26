package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4370 {
    private final Productionnull_4370 production = new Productionnull_4370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}