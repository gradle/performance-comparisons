package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40263 {
    private final Productionnull_40263 production = new Productionnull_40263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}