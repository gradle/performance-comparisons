package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1806 {
    private final Productionnull_1806 production = new Productionnull_1806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}