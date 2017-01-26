package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42059 {
    private final Productionnull_42059 production = new Productionnull_42059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}