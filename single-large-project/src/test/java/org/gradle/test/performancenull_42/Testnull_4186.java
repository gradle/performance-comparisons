package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4186 {
    private final Productionnull_4186 production = new Productionnull_4186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}