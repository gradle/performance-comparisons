package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1747 {
    private final Productionnull_1747 production = new Productionnull_1747("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}