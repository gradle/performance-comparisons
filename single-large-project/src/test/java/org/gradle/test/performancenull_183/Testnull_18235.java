package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18235 {
    private final Productionnull_18235 production = new Productionnull_18235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}