package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1183 {
    private final Productionnull_1183 production = new Productionnull_1183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}