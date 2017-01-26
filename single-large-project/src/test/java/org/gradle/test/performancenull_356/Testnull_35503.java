package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35503 {
    private final Productionnull_35503 production = new Productionnull_35503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}