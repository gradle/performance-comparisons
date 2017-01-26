package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42090 {
    private final Productionnull_42090 production = new Productionnull_42090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}