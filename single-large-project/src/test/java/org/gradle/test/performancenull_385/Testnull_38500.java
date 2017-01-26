package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38500 {
    private final Productionnull_38500 production = new Productionnull_38500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}