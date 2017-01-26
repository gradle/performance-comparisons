package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42402 {
    private final Productionnull_42402 production = new Productionnull_42402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}