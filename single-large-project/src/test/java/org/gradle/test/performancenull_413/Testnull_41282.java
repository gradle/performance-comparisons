package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41282 {
    private final Productionnull_41282 production = new Productionnull_41282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}