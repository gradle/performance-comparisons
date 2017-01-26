package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2771 {
    private final Productionnull_2771 production = new Productionnull_2771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}