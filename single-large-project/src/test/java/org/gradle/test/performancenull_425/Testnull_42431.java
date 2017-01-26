package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42431 {
    private final Productionnull_42431 production = new Productionnull_42431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}