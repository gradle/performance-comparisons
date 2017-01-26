package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4164 {
    private final Productionnull_4164 production = new Productionnull_4164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}