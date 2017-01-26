package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40169 {
    private final Productionnull_40169 production = new Productionnull_40169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}