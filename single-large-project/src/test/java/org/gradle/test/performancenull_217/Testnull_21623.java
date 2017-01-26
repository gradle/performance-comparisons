package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21623 {
    private final Productionnull_21623 production = new Productionnull_21623("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}