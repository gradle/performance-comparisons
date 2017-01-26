package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12027 {
    private final Productionnull_12027 production = new Productionnull_12027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}