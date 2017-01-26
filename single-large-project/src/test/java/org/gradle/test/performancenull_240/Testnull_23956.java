package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23956 {
    private final Productionnull_23956 production = new Productionnull_23956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}