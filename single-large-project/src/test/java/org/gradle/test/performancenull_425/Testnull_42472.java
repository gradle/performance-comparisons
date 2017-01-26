package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42472 {
    private final Productionnull_42472 production = new Productionnull_42472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}