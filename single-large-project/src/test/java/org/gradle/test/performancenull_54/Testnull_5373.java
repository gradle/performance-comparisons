package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5373 {
    private final Productionnull_5373 production = new Productionnull_5373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}