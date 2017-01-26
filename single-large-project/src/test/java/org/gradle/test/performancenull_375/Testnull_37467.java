package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37467 {
    private final Productionnull_37467 production = new Productionnull_37467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}