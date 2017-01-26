package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42401 {
    private final Productionnull_42401 production = new Productionnull_42401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}