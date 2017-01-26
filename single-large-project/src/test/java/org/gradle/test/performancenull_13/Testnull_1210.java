package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1210 {
    private final Productionnull_1210 production = new Productionnull_1210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}