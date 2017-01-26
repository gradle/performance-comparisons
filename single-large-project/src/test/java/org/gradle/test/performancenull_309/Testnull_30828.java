package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30828 {
    private final Productionnull_30828 production = new Productionnull_30828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}