package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21218 {
    private final Productionnull_21218 production = new Productionnull_21218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}