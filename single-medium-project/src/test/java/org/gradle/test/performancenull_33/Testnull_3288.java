package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3288 {
    private final Productionnull_3288 production = new Productionnull_3288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}