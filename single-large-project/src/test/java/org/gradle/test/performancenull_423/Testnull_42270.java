package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42270 {
    private final Productionnull_42270 production = new Productionnull_42270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}