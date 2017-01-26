package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2106 {
    private final Productionnull_2106 production = new Productionnull_2106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}