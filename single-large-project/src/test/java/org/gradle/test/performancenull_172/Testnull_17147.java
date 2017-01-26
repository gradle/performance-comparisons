package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17147 {
    private final Productionnull_17147 production = new Productionnull_17147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}