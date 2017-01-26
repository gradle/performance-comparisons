package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18769 {
    private final Productionnull_18769 production = new Productionnull_18769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}