package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3769 {
    private final Productionnull_3769 production = new Productionnull_3769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}