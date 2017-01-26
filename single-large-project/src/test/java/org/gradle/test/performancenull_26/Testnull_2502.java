package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2502 {
    private final Productionnull_2502 production = new Productionnull_2502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}