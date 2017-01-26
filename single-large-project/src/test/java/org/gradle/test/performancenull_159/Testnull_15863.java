package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15863 {
    private final Productionnull_15863 production = new Productionnull_15863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}