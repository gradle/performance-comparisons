package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21550 {
    private final Productionnull_21550 production = new Productionnull_21550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}