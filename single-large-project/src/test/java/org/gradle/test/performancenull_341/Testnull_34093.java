package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34093 {
    private final Productionnull_34093 production = new Productionnull_34093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}