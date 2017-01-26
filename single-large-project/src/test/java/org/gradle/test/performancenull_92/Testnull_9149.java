package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9149 {
    private final Productionnull_9149 production = new Productionnull_9149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}