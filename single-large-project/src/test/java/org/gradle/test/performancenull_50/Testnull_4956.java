package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4956 {
    private final Productionnull_4956 production = new Productionnull_4956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}