package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2415 {
    private final Productionnull_2415 production = new Productionnull_2415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}