package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4270 {
    private final Productionnull_4270 production = new Productionnull_4270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}