package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21307 {
    private final Productionnull_21307 production = new Productionnull_21307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}