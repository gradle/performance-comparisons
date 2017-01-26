package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24270 {
    private final Productionnull_24270 production = new Productionnull_24270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}