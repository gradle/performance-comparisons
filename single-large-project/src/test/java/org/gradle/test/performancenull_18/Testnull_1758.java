package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1758 {
    private final Productionnull_1758 production = new Productionnull_1758("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}