package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26481 {
    private final Productionnull_26481 production = new Productionnull_26481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}