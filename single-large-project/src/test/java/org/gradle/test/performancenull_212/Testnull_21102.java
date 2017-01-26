package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21102 {
    private final Productionnull_21102 production = new Productionnull_21102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}