package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21362 {
    private final Productionnull_21362 production = new Productionnull_21362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}