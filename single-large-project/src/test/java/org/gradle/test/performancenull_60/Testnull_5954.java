package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5954 {
    private final Productionnull_5954 production = new Productionnull_5954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}