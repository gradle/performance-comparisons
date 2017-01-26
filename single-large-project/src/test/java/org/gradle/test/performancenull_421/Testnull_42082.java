package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42082 {
    private final Productionnull_42082 production = new Productionnull_42082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}