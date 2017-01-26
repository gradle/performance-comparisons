package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25601 {
    private final Productionnull_25601 production = new Productionnull_25601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}