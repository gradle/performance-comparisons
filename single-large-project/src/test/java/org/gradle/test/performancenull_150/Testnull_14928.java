package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14928 {
    private final Productionnull_14928 production = new Productionnull_14928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}