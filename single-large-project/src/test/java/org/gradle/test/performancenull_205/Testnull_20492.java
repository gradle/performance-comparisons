package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20492 {
    private final Productionnull_20492 production = new Productionnull_20492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}