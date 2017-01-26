package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30875 {
    private final Productionnull_30875 production = new Productionnull_30875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}