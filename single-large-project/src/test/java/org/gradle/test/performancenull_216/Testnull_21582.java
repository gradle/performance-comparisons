package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21582 {
    private final Productionnull_21582 production = new Productionnull_21582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}