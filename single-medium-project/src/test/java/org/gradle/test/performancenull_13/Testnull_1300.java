package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1300 {
    private final Productionnull_1300 production = new Productionnull_1300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}