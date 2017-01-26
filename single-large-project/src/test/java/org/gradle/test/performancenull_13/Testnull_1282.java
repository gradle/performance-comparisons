package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1282 {
    private final Productionnull_1282 production = new Productionnull_1282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}