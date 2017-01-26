package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18028 {
    private final Productionnull_18028 production = new Productionnull_18028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}