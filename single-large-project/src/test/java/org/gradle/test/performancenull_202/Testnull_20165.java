package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20165 {
    private final Productionnull_20165 production = new Productionnull_20165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}