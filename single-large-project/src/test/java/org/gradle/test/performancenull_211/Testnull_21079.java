package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21079 {
    private final Productionnull_21079 production = new Productionnull_21079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}