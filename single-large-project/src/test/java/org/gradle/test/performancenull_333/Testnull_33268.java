package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33268 {
    private final Productionnull_33268 production = new Productionnull_33268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}