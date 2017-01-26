package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18276 {
    private final Productionnull_18276 production = new Productionnull_18276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}