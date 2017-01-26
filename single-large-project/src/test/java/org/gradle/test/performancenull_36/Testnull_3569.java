package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3569 {
    private final Productionnull_3569 production = new Productionnull_3569("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}