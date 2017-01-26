package org.gradle.test.performancenull_460;

import static org.junit.Assert.*;

public class Testnull_46000 {
    private final Productionnull_46000 production = new Productionnull_46000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}