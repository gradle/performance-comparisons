package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21429 {
    private final Productionnull_21429 production = new Productionnull_21429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}