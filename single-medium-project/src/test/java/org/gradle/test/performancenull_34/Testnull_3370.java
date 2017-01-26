package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3370 {
    private final Productionnull_3370 production = new Productionnull_3370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}