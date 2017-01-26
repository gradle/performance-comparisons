package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5268 {
    private final Productionnull_5268 production = new Productionnull_5268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}