package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28481 {
    private final Productionnull_28481 production = new Productionnull_28481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}