package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5260 {
    private final Productionnull_5260 production = new Productionnull_5260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}