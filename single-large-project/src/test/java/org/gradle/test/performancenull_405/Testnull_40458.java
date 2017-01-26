package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40458 {
    private final Productionnull_40458 production = new Productionnull_40458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}