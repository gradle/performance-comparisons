package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38462 {
    private final Productionnull_38462 production = new Productionnull_38462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}