package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37083 {
    private final Productionnull_37083 production = new Productionnull_37083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}