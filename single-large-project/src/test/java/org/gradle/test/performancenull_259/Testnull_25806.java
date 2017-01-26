package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25806 {
    private final Productionnull_25806 production = new Productionnull_25806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}