package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40299 {
    private final Productionnull_40299 production = new Productionnull_40299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}