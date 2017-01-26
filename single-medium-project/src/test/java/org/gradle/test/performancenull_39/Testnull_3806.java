package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3806 {
    private final Productionnull_3806 production = new Productionnull_3806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}