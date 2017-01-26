package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38473 {
    private final Productionnull_38473 production = new Productionnull_38473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}