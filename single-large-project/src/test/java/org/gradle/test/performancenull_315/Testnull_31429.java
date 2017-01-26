package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31429 {
    private final Productionnull_31429 production = new Productionnull_31429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}