package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14964 {
    private final Productionnull_14964 production = new Productionnull_14964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}