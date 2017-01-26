package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2600 {
    private final Productionnull_2600 production = new Productionnull_2600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}