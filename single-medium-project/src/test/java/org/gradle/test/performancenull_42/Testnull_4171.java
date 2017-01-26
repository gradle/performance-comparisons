package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4171 {
    private final Productionnull_4171 production = new Productionnull_4171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}