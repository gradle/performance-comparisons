package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30668 {
    private final Productionnull_30668 production = new Productionnull_30668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}