package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2060 {
    private final Productionnull_2060 production = new Productionnull_2060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}