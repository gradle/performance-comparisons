package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3803 {
    private final Productionnull_3803 production = new Productionnull_3803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}