package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31443 {
    private final Productionnull_31443 production = new Productionnull_31443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}