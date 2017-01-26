package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38470 {
    private final Productionnull_38470 production = new Productionnull_38470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}