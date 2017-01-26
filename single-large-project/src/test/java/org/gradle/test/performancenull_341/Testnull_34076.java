package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34076 {
    private final Productionnull_34076 production = new Productionnull_34076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}