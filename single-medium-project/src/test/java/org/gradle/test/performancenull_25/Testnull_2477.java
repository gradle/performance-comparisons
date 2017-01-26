package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2477 {
    private final Productionnull_2477 production = new Productionnull_2477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}