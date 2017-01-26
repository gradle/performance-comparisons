package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30187 {
    private final Productionnull_30187 production = new Productionnull_30187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}