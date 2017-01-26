package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41676 {
    private final Productionnull_41676 production = new Productionnull_41676("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}