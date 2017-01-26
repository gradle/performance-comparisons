package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40811 {
    private final Productionnull_40811 production = new Productionnull_40811("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}