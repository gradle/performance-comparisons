package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19075 {
    private final Productionnull_19075 production = new Productionnull_19075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}