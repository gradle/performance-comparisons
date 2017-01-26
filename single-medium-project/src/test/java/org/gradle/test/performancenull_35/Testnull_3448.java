package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3448 {
    private final Productionnull_3448 production = new Productionnull_3448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}