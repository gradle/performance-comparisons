package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42260 {
    private final Productionnull_42260 production = new Productionnull_42260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}