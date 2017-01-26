package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2435 {
    private final Productionnull_2435 production = new Productionnull_2435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}