package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42171 {
    private final Productionnull_42171 production = new Productionnull_42171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}