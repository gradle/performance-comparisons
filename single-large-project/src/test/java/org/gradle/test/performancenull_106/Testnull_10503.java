package org.gradle.test.performancenull_106;

import static org.junit.Assert.*;

public class Testnull_10503 {
    private final Productionnull_10503 production = new Productionnull_10503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}