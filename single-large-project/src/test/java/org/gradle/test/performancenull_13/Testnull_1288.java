package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1288 {
    private final Productionnull_1288 production = new Productionnull_1288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}