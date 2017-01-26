package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5246 {
    private final Productionnull_5246 production = new Productionnull_5246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}