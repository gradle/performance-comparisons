package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21548 {
    private final Productionnull_21548 production = new Productionnull_21548("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}