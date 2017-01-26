package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38498 {
    private final Productionnull_38498 production = new Productionnull_38498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}