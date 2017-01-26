package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_106 {
    private final Productionnull_106 production = new Productionnull_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}