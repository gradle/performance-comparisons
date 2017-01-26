package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4090 {
    private final Productionnull_4090 production = new Productionnull_4090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}