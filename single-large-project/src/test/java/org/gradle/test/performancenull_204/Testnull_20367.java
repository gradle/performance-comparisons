package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20367 {
    private final Productionnull_20367 production = new Productionnull_20367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}