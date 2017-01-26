package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23981 {
    private final Productionnull_23981 production = new Productionnull_23981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}