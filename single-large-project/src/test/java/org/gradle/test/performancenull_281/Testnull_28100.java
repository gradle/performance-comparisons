package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28100 {
    private final Productionnull_28100 production = new Productionnull_28100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}