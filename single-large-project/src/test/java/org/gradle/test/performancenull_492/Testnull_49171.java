package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49171 {
    private final Productionnull_49171 production = new Productionnull_49171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}