package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24793 {
    private final Productionnull_24793 production = new Productionnull_24793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}