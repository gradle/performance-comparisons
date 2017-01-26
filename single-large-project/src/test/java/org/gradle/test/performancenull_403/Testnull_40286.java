package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40286 {
    private final Productionnull_40286 production = new Productionnull_40286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}