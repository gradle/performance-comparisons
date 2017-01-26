package org.gradle.test.performancenull_488;

import static org.junit.Assert.*;

public class Testnull_48705 {
    private final Productionnull_48705 production = new Productionnull_48705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}