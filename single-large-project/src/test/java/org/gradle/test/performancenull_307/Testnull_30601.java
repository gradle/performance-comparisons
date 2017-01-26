package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30601 {
    private final Productionnull_30601 production = new Productionnull_30601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}