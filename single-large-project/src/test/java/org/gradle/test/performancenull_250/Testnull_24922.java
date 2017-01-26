package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24922 {
    private final Productionnull_24922 production = new Productionnull_24922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}