package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40281 {
    private final Productionnull_40281 production = new Productionnull_40281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}