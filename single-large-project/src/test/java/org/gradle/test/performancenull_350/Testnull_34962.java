package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34962 {
    private final Productionnull_34962 production = new Productionnull_34962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}