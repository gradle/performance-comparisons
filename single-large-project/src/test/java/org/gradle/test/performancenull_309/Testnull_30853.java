package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30853 {
    private final Productionnull_30853 production = new Productionnull_30853("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}